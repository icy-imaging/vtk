// java wrapper for vtkUnstructuredGridBaseAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridBaseAlgorithm extends vtkAlgorithm
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

  private native long GetOutput_4();
  public vtkUnstructuredGridBase GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkUnstructuredGridBase GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutput_6(vtkDataObject id0);
  public void SetOutput(vtkDataObject id0)
  {
    SetOutput_6(id0);
  }

  private native void SetInputData_7(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_7(id0);
  }

  private native void SetInputData_8(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_8(id0,id1);
  }

  private native void AddInputData_9(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_9(id0);
  }

  private native void AddInputData_10(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_10(id0,id1);
  }

  public vtkUnstructuredGridBaseAlgorithm() { super(); }

  public vtkUnstructuredGridBaseAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
