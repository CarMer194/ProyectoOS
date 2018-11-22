package proyectoso;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hector
 */
public class AlgoritmoTMCC extends AbstractTableModel {

    ArrayList<Float>[] cola;
    boolean[] usados;
    boolean[] activos;
    boolean[] terminados;
    float[] estimaciones;
    float[] listoEn;
    float[] tRetorno;
    float[] tEspera;
    float[] tRespuesta;

    int contador;
    ArrayList<String[]> historial;

    private float a;
    private float conmutacion;

    float tiempo;
    float oldTiempo;

    StringBuilder sb;

    public AlgoritmoTMCC() {
        cola = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        usados = new boolean[3];
        activos = new boolean[3];
        terminados = new boolean[3];
        estimaciones = new float[3];

        tRetorno = new float[3];
        tEspera = new float[3];
        tRespuesta = new float[3];

        listoEn = new float[3];
        historial = new ArrayList<>();
        historial.add(new String[]{"0", "0", "0", "0"});

    }

    public boolean simular() {
        int actual = getNextProceso();
        if (actual < 0) {
            return false;
        }
        historial.add(new String[]{"0", "0", "0", "0"});
        fireTableDataChanged();
        contador++;
        oldTiempo = tiempo;
        tiempo += cola[actual].remove(0);
        tiempo += conmutacion;
        nuevaEstimacion(actual, tiempo - oldTiempo);
        if (cola[actual].isEmpty() && !terminados[actual]) {
            terminados[actual] = true;
            tRetorno[actual] = tiempo - listoEn[actual];
            System.out.println(tRetorno[actual]);
        }
        setValueAt(String.format("%.2f", tiempo), contador, 0);
        for (int i = 0; i < 3; i++) {
            if (listoEn[i] >= oldTiempo && !activos[i]) {
                tRespuesta[i] += oldTiempo;
                activos[i] = true;
            }
            if (!terminados[i] && i != actual) {
                tEspera[i] += tiempo - oldTiempo;
            }
            if (activos[i]) {
                setValueAt(cola[i].toString(), contador, i + 1);
            }
        }
        return true;
    }
    
    public int getContador(){
        return contador;
    }

    public void addRafaga(int proceso, float duracion) {
        if (!usados[proceso]) {
            setValueAt(String.valueOf(duracion), 0, proceso + 1);
            cola[proceso].add(duracion);
            usados[proceso] = true;
        } else {
            cola[proceso].add(duracion);
            for (String[] strings : historial) {
                for (int i = 0; i < strings.length; i++) {
                    System.out.println(strings[i]);
                }
            }
            setValueAt(historial.get(0)[proceso + 1].concat(", " + duracion), 0, proceso + 1);
        }
    }

    public void nuevaEstimacion(int proceso, float tiempo) {
        estimaciones[proceso] = (estimaciones[proceso] * a) + tiempo * (1 - a);
    }

    public void setEstimacion(float estimacion, int proceso) {
        estimaciones[proceso] = estimacion;
    }

    public void setListoEn(float tiempo, int proceso) {
        listoEn[proceso] = tiempo;
    }

    public void clear() {
        historial = new ArrayList<>();
        cola = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        historial.add(new String[]{"0", "0", "0", "0"});
        for (int i = 0; i < usados.length; i++) {
            usados[i] = false;
            terminados[i]=false;
            activos[i]=false;
            tEspera[i]=tRetorno[i]=tRespuesta[i]=0;
        }
        fireTableDataChanged();
        contador=0;
        
    }

    private int getNextProceso() {
        float min = Float.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < estimaciones.length; i++) {
            if (estimaciones[i] < min && usados[i] && !terminados[i]) {
                min = estimaciones[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public float getEstimacion(int proceso) {
        return estimaciones[proceso];
    }

    public float getListoEn(int proceso) {
        return listoEn[proceso];
    }

    public float[] getTiempos(int proceso) {
        return new float[]{tRetorno[proceso], tEspera[proceso], tRespuesta[proceso]};
    }

    String getProcesoString(int proceso) {
        if (usados[proceso]) {
            sb = new StringBuilder();
            for (Float t : cola[proceso]) {
                sb.append(String.format("%.2f", t));
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        } else {
            return "";
        }
    }

    @Override
    public int getRowCount() {
        return historial.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex > 0) {
            return "Proceso " + (columnIndex);
        } else {
            return "tiempo";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return historial.get(rowIndex)[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        historial.get(rowIndex)[columnIndex] = String.valueOf(aValue);
        fireTableCellUpdated(rowIndex, columnIndex);
        //fireTableDataChanged();
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @param conmutacion the conmutacion to set
     */
    public void setConmutacion(float conmutacion) {
        this.conmutacion = conmutacion;
    }
}