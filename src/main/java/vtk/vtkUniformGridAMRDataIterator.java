// java wrapper for vtkUniformGridAMRDataIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniformGridAMRDataIterator extends vtkCompositeDataIterator
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

  private native long GetCurrentMetaData_4();
  public vtkInformation GetCurrentMetaData()
  {
    long temp = GetCurrentMetaData_4();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasCurrentMetaData_5();
  public int HasCurrentMetaData()
  {
    return HasCurrentMetaData_5();
  }

  private native long GetCurrentDataObject_6();
  public vtkDataObject GetCurrentDataObject()
  {
    long temp = GetCurrentDataObject_6();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetCurrentFlatIndex_7();
  public int GetCurrentFlatIndex()
  {
    return GetCurrentFlatIndex_7();
  }

  private native int GetCurrentLevel_8();
  public int GetCurrentLevel()
  {
    return GetCurrentLevel_8();
  }

  private native int GetCurrentIndex_9();
  public int GetCurrentIndex()
  {
    return GetCurrentIndex_9();
  }

  private native void GoToFirstItem_10();
  public void GoToFirstItem()
  {
    GoToFirstItem_10();
  }

  private native void GoToNextItem_11();
  public void GoToNextItem()
  {
    GoToNextItem_11();
  }

  private native int IsDoneWithTraversal_12();
  public int IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_12();
  }

  public vtkUniformGridAMRDataIterator() { super(); }

  public vtkUniformGridAMRDataIterator(long id) { super(id); }
  public native long   VTKInit();

}
