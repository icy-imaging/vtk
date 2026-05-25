// java wrapper for vtkInformationIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationIterator extends vtkObject
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

  private native void SetInformation_4(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_4(id0);
  }

  private native long GetInformation_5();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_5();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformationWeak_6(vtkInformation id0);
  public void SetInformationWeak(vtkInformation id0)
  {
    SetInformationWeak_6(id0);
  }

  private native void InitTraversal_7();
  public void InitTraversal()
  {
    InitTraversal_7();
  }

  private native void GoToFirstItem_8();
  public void GoToFirstItem()
  {
    GoToFirstItem_8();
  }

  private native void GoToNextItem_9();
  public void GoToNextItem()
  {
    GoToNextItem_9();
  }

  private native int IsDoneWithTraversal_10();
  public int IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_10();
  }

  private native long GetCurrentKey_11();
  public vtkInformationKey GetCurrentKey()
  {
    long temp = GetCurrentKey_11();

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkInformationIterator() { super(); }

  public vtkInformationIterator(long id) { super(id); }
  public native long   VTKInit();

}
