// java wrapper for vtkRemovePolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRemovePolyData extends vtkPolyDataAlgorithm
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

  private native void RemoveInputData_4(vtkPolyData id0);
  public void RemoveInputData(vtkPolyData id0)
  {
    RemoveInputData_4(id0);
  }

  private native long GetInput_5(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_5(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_6();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellIds_7(vtkIdTypeArray id0);
  public void SetCellIds(vtkIdTypeArray id0)
  {
    SetCellIds_7(id0);
  }

  private native long GetCellIds_8();
  public vtkIdTypeArray GetCellIds()
  {
    long temp = GetCellIds_8();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointIds_9(vtkIdTypeArray id0);
  public void SetPointIds(vtkIdTypeArray id0)
  {
    SetPointIds_9(id0);
  }

  private native long GetPointIds_10();
  public vtkIdTypeArray GetPointIds()
  {
    long temp = GetPointIds_10();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExactMatch_11(boolean id0);
  public void SetExactMatch(boolean id0)
  {
    SetExactMatch_11(id0);
  }

  private native boolean GetExactMatch_12();
  public boolean GetExactMatch()
  {
    return GetExactMatch_12();
  }

  private native void ExactMatchOn_13();
  public void ExactMatchOn()
  {
    ExactMatchOn_13();
  }

  private native void ExactMatchOff_14();
  public void ExactMatchOff()
  {
    ExactMatchOff_14();
  }

  public vtkRemovePolyData() { super(); }

  public vtkRemovePolyData(long id) { super(id); }
  public native long   VTKInit();

}
