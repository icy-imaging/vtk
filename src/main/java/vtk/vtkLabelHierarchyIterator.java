// java wrapper for vtkLabelHierarchyIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelHierarchyIterator extends vtkObject
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

  private native void Begin_4(vtkIdTypeArray id0);
  public void Begin(vtkIdTypeArray id0)
  {
    Begin_4(id0);
  }

  private native void Next_5();
  public void Next()
  {
    Next_5();
  }

  private native boolean IsAtEnd_6();
  public boolean IsAtEnd()
  {
    return IsAtEnd_6();
  }

  private native void GetPoint_7(double id0[]);
  public void GetPoint(double id0[])
  {
    GetPoint_7(id0);
  }

  private native void GetSize_8(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_8(id0);
  }

  private native void GetBoundedSize_9(double id0[]);
  public void GetBoundedSize(double id0[])
  {
    GetBoundedSize_9(id0);
  }

  private native int GetType_10();
  public int GetType()
  {
    return GetType_10();
  }

  private native byte[] GetLabel_11();
  public String GetLabel()
  {
    return new String(GetLabel_11(), StandardCharsets.UTF_8);
  }

  private native double GetOrientation_12();
  public double GetOrientation()
  {
    return GetOrientation_12();
  }

  private native long GetLabelId_13();
  public long GetLabelId()
  {
    return GetLabelId_13();
  }

  private native long GetHierarchy_14();
  public vtkLabelHierarchy GetHierarchy()
  {
    long temp = GetHierarchy_14();

    if (temp == 0) return null;
    return (vtkLabelHierarchy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTraversedBounds_15(vtkPolyData id0);
  public void SetTraversedBounds(vtkPolyData id0)
  {
    SetTraversedBounds_15(id0);
  }

  private native void BoxNode_16();
  public void BoxNode()
  {
    BoxNode_16();
  }

  private native void BoxAllNodes_17(vtkPolyData id0);
  public void BoxAllNodes(vtkPolyData id0)
  {
    BoxAllNodes_17(id0);
  }

  private native void SetAllBounds_18(int id0);
  public void SetAllBounds(int id0)
  {
    SetAllBounds_18(id0);
  }

  private native int GetAllBounds_19();
  public int GetAllBounds()
  {
    return GetAllBounds_19();
  }

  public vtkLabelHierarchyIterator() { super(); }

  public vtkLabelHierarchyIterator(long id) { super(id); }

}
