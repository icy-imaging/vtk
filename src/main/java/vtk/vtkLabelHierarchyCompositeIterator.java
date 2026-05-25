// java wrapper for vtkLabelHierarchyCompositeIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelHierarchyCompositeIterator extends vtkLabelHierarchyIterator
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

  private native void AddIterator_4(vtkLabelHierarchyIterator id0);
  public void AddIterator(vtkLabelHierarchyIterator id0)
  {
    AddIterator_4(id0);
  }

  private native void AddIterator_5(vtkLabelHierarchyIterator id0,int id1);
  public void AddIterator(vtkLabelHierarchyIterator id0,int id1)
  {
    AddIterator_5(id0,id1);
  }

  private native void ClearIterators_6();
  public void ClearIterators()
  {
    ClearIterators_6();
  }

  private native void Begin_7(vtkIdTypeArray id0);
  public void Begin(vtkIdTypeArray id0)
  {
    Begin_7(id0);
  }

  private native void Next_8();
  public void Next()
  {
    Next_8();
  }

  private native boolean IsAtEnd_9();
  public boolean IsAtEnd()
  {
    return IsAtEnd_9();
  }

  private native long GetLabelId_10();
  public long GetLabelId()
  {
    return GetLabelId_10();
  }

  private native long GetHierarchy_11();
  public vtkLabelHierarchy GetHierarchy()
  {
    long temp = GetHierarchy_11();

    if (temp == 0) return null;
    return (vtkLabelHierarchy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BoxNode_12();
  public void BoxNode()
  {
    BoxNode_12();
  }

  private native void BoxAllNodes_13(vtkPolyData id0);
  public void BoxAllNodes(vtkPolyData id0)
  {
    BoxAllNodes_13(id0);
  }

  public vtkLabelHierarchyCompositeIterator() { super(); }

  public vtkLabelHierarchyCompositeIterator(long id) { super(id); }
  public native long   VTKInit();

}
