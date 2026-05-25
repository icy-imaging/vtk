// java wrapper for vtkVisibilitySort object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVisibilitySort extends vtkObject
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

  private native void InitTraversal_4();
  public void InitTraversal()
  {
    InitTraversal_4();
  }

  private native long GetNextCells_5();
  public vtkIdTypeArray GetNextCells()
  {
    long temp = GetNextCells_5();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaxCellsReturned_6(int id0);
  public void SetMaxCellsReturned(int id0)
  {
    SetMaxCellsReturned_6(id0);
  }

  private native int GetMaxCellsReturnedMinValue_7();
  public int GetMaxCellsReturnedMinValue()
  {
    return GetMaxCellsReturnedMinValue_7();
  }

  private native int GetMaxCellsReturnedMaxValue_8();
  public int GetMaxCellsReturnedMaxValue()
  {
    return GetMaxCellsReturnedMaxValue_8();
  }

  private native int GetMaxCellsReturned_9();
  public int GetMaxCellsReturned()
  {
    return GetMaxCellsReturned_9();
  }

  private native void SetModelTransform_10(vtkMatrix4x4 id0);
  public void SetModelTransform(vtkMatrix4x4 id0)
  {
    SetModelTransform_10(id0);
  }

  private native long GetModelTransform_11();
  public vtkMatrix4x4 GetModelTransform()
  {
    long temp = GetModelTransform_11();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInverseModelTransform_12();
  public vtkMatrix4x4 GetInverseModelTransform()
  {
    long temp = GetInverseModelTransform_12();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCamera_13(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_13(id0);
  }

  private native long GetCamera_14();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_14();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInput_15(vtkDataSet id0);
  public void SetInput(vtkDataSet id0)
  {
    SetInput_15(id0);
  }

  private native long GetInput_16();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_16();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDirection_17();
  public int GetDirection()
  {
    return GetDirection_17();
  }

  private native void SetDirection_18(int id0);
  public void SetDirection(int id0)
  {
    SetDirection_18(id0);
  }

  private native void SetDirectionToBackToFront_19();
  public void SetDirectionToBackToFront()
  {
    SetDirectionToBackToFront_19();
  }

  private native void SetDirectionToFrontToBack_20();
  public void SetDirectionToFrontToBack()
  {
    SetDirectionToFrontToBack_20();
  }

  private native boolean UsesGarbageCollector_21();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_21();
  }

  public vtkVisibilitySort() { super(); }

  public vtkVisibilitySort(long id) { super(id); }

}
