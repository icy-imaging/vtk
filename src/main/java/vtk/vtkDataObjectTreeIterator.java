// java wrapper for vtkDataObjectTreeIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectTreeIterator extends vtkCompositeDataIterator
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

  private native void GoToFirstItem_4();
  public void GoToFirstItem()
  {
    GoToFirstItem_4();
  }

  private native void GoToNextItem_5();
  public void GoToNextItem()
  {
    GoToNextItem_5();
  }

  private native int IsDoneWithTraversal_6();
  public int IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_6();
  }

  private native long GetCurrentDataObject_7();
  public vtkDataObject GetCurrentDataObject()
  {
    long temp = GetCurrentDataObject_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCurrentMetaData_8();
  public vtkInformation GetCurrentMetaData()
  {
    long temp = GetCurrentMetaData_8();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasCurrentMetaData_9();
  public int HasCurrentMetaData()
  {
    return HasCurrentMetaData_9();
  }

  private native int GetCurrentFlatIndex_10();
  public int GetCurrentFlatIndex()
  {
    return GetCurrentFlatIndex_10();
  }

  private native void SetVisitOnlyLeaves_11(int id0);
  public void SetVisitOnlyLeaves(int id0)
  {
    SetVisitOnlyLeaves_11(id0);
  }

  private native int GetVisitOnlyLeaves_12();
  public int GetVisitOnlyLeaves()
  {
    return GetVisitOnlyLeaves_12();
  }

  private native void VisitOnlyLeavesOn_13();
  public void VisitOnlyLeavesOn()
  {
    VisitOnlyLeavesOn_13();
  }

  private native void VisitOnlyLeavesOff_14();
  public void VisitOnlyLeavesOff()
  {
    VisitOnlyLeavesOff_14();
  }

  private native void SetTraverseSubTree_15(int id0);
  public void SetTraverseSubTree(int id0)
  {
    SetTraverseSubTree_15(id0);
  }

  private native int GetTraverseSubTree_16();
  public int GetTraverseSubTree()
  {
    return GetTraverseSubTree_16();
  }

  private native void TraverseSubTreeOn_17();
  public void TraverseSubTreeOn()
  {
    TraverseSubTreeOn_17();
  }

  private native void TraverseSubTreeOff_18();
  public void TraverseSubTreeOff()
  {
    TraverseSubTreeOff_18();
  }

  public vtkDataObjectTreeIterator() { super(); }

  public vtkDataObjectTreeIterator(long id) { super(id); }
  public native long   VTKInit();

}
