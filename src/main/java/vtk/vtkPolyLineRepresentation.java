// java wrapper for vtkPolyLineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyLineRepresentation extends vtkCurveRepresentation
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

  private native void GetPolyData_4(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_4(id0);
  }

  private native void SetNumberOfHandles_5(int id0);
  public void SetNumberOfHandles(int id0)
  {
    SetNumberOfHandles_5(id0);
  }

  private native long GetHandlePositions_6();
  public vtkDoubleArray GetHandlePositions()
  {
    long temp = GetHandlePositions_6();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetSummedLength_7();
  public double GetSummedLength()
  {
    return GetSummedLength_7();
  }

  private native void InitializeHandles_8(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_8(id0);
  }

  private native void BuildRepresentation_9();
  public void BuildRepresentation()
  {
    BuildRepresentation_9();
  }

  public vtkPolyLineRepresentation() { super(); }

  public vtkPolyLineRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
