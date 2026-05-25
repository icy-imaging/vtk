// java wrapper for vtkCompositeDataIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataIterator extends vtkObject
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

  private native void SetDataSet_4(vtkCompositeDataSet id0);
  public void SetDataSet(vtkCompositeDataSet id0)
  {
    SetDataSet_4(id0);
  }

  private native long GetDataSet_5();
  public vtkCompositeDataSet GetDataSet()
  {
    long temp = GetDataSet_5();

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitTraversal_6();
  public void InitTraversal()
  {
    InitTraversal_6();
  }

  private native void InitReverseTraversal_7();
  public void InitReverseTraversal()
  {
    InitReverseTraversal_7();
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

  private native long GetCurrentDataObject_11();
  public vtkDataObject GetCurrentDataObject()
  {
    long temp = GetCurrentDataObject_11();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCurrentMetaData_12();
  public vtkInformation GetCurrentMetaData()
  {
    long temp = GetCurrentMetaData_12();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasCurrentMetaData_13();
  public int HasCurrentMetaData()
  {
    return HasCurrentMetaData_13();
  }

  private native void SetSkipEmptyNodes_14(int id0);
  public void SetSkipEmptyNodes(int id0)
  {
    SetSkipEmptyNodes_14(id0);
  }

  private native int GetSkipEmptyNodes_15();
  public int GetSkipEmptyNodes()
  {
    return GetSkipEmptyNodes_15();
  }

  private native void SkipEmptyNodesOn_16();
  public void SkipEmptyNodesOn()
  {
    SkipEmptyNodesOn_16();
  }

  private native void SkipEmptyNodesOff_17();
  public void SkipEmptyNodesOff()
  {
    SkipEmptyNodesOff_17();
  }

  private native int GetCurrentFlatIndex_18();
  public int GetCurrentFlatIndex()
  {
    return GetCurrentFlatIndex_18();
  }

  private native int GetReverse_19();
  public int GetReverse()
  {
    return GetReverse_19();
  }

  public vtkCompositeDataIterator() { super(); }

  public vtkCompositeDataIterator(long id) { super(id); }

}
