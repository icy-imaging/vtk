// java wrapper for vtkViewNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkViewNode extends vtkObject
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

  private native long GetRenderable_4();
  public vtkObject GetRenderable()
  {
    long temp = GetRenderable_4();

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Build_5(boolean id0);
  public void Build(boolean id0)
  {
    Build_5(id0);
  }

  private native void Synchronize_6(boolean id0);
  public void Synchronize(boolean id0)
  {
    Synchronize_6(id0);
  }

  private native void Render_7(boolean id0);
  public void Render(boolean id0)
  {
    Render_7(id0);
  }

  private native void Invalidate_8(boolean id0);
  public void Invalidate(boolean id0)
  {
    Invalidate_8(id0);
  }

  private native void SetParent_9(vtkViewNode id0);
  public void SetParent(vtkViewNode id0)
  {
    SetParent_9(id0);
  }

  private native long GetParent_10();
  public vtkViewNode GetParent()
  {
    long temp = GetParent_10();

    if (temp == 0) return null;
    return (vtkViewNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMyFactory_11(vtkViewNodeFactory id0);
  public void SetMyFactory(vtkViewNodeFactory id0)
  {
    SetMyFactory_11(id0);
  }

  private native long GetMyFactory_12();
  public vtkViewNodeFactory GetMyFactory()
  {
    long temp = GetMyFactory_12();

    if (temp == 0) return null;
    return (vtkViewNodeFactory)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewNodeFor_13(vtkObject id0);
  public vtkViewNode GetViewNodeFor(vtkObject id0)
  {
    long temp = GetViewNodeFor_13(id0);

    if (temp == 0) return null;
    return (vtkViewNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFirstAncestorOfType_14(byte[] id0, int len0);
  public vtkViewNode GetFirstAncestorOfType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetFirstAncestorOfType_14(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkViewNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFirstChildOfType_15(byte[] id0, int len0);
  public vtkViewNode GetFirstChildOfType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetFirstChildOfType_15(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkViewNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderable_16(vtkObject id0);
  public void SetRenderable(vtkObject id0)
  {
    SetRenderable_16(id0);
  }

  private native void Traverse_17(int id0);
  public void Traverse(int id0)
  {
    Traverse_17(id0);
  }

  private native void TraverseAllPasses_18();
  public void TraverseAllPasses()
  {
    TraverseAllPasses_18();
  }

  public vtkViewNode() { super(); }

  public vtkViewNode(long id) { super(id); }

}
