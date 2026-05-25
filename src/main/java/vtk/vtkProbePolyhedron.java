// java wrapper for vtkProbePolyhedron object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProbePolyhedron extends vtkDataSetAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetSourceData_4(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native void SetProbePointData_7(int id0);
  public void SetProbePointData(int id0)
  {
    SetProbePointData_7(id0);
  }

  private native int GetProbePointData_8();
  public int GetProbePointData()
  {
    return GetProbePointData_8();
  }

  private native void ProbePointDataOn_9();
  public void ProbePointDataOn()
  {
    ProbePointDataOn_9();
  }

  private native void ProbePointDataOff_10();
  public void ProbePointDataOff()
  {
    ProbePointDataOff_10();
  }

  private native void SetProbeCellData_11(int id0);
  public void SetProbeCellData(int id0)
  {
    SetProbeCellData_11(id0);
  }

  private native int GetProbeCellData_12();
  public int GetProbeCellData()
  {
    return GetProbeCellData_12();
  }

  private native void ProbeCellDataOn_13();
  public void ProbeCellDataOn()
  {
    ProbeCellDataOn_13();
  }

  private native void ProbeCellDataOff_14();
  public void ProbeCellDataOff()
  {
    ProbeCellDataOff_14();
  }

  public vtkProbePolyhedron() { super(); }

  public vtkProbePolyhedron(long id) { super(id); }
  public native long   VTKInit();

}
