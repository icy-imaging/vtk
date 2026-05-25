// java wrapper for vtkAbstractContextItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractContextItem extends vtkObject
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native boolean PaintChildren_6(vtkContext2D id0);
  public boolean PaintChildren(vtkContext2D id0)
  {
    return PaintChildren_6(id0);
  }

  private native void ReleaseGraphicsResources_7();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_7();
  }

  private native long AddItem_8(vtkAbstractContextItem id0);
  public long AddItem(vtkAbstractContextItem id0)
  {
    return AddItem_8(id0);
  }

  private native boolean RemoveItem_9(vtkAbstractContextItem id0);
  public boolean RemoveItem(vtkAbstractContextItem id0)
  {
    return RemoveItem_9(id0);
  }

  private native boolean RemoveItem_10(long id0);
  public boolean RemoveItem(long id0)
  {
    return RemoveItem_10(id0);
  }

  private native long GetItem_11(long id0);
  public vtkAbstractContextItem GetItem(long id0)
  {
    long temp = GetItem_11(id0);

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetItemIndex_12(vtkAbstractContextItem id0);
  public long GetItemIndex(vtkAbstractContextItem id0)
  {
    return GetItemIndex_12(id0);
  }

  private native long GetNumberOfItems_13();
  public long GetNumberOfItems()
  {
    return GetNumberOfItems_13();
  }

  private native void ClearItems_14();
  public void ClearItems()
  {
    ClearItems_14();
  }

  private native long Raise_15(long id0);
  public long Raise(long id0)
  {
    return Raise_15(id0);
  }

  private native long StackAbove_16(long id0,long id1);
  public long StackAbove(long id0,long id1)
  {
    return StackAbove_16(id0,id1);
  }

  private native long Lower_17(long id0);
  public long Lower(long id0)
  {
    return Lower_17(id0);
  }

  private native long StackUnder_18(long id0,long id1);
  public long StackUnder(long id0,long id1)
  {
    return StackUnder_18(id0,id1);
  }

  private native void SetScene_19(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_19(id0);
  }

  private native long GetScene_20();
  public vtkContextScene GetScene()
  {
    long temp = GetScene_20();

    if (temp == 0) return null;
    return (vtkContextScene)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParent_21(vtkAbstractContextItem id0);
  public void SetParent(vtkAbstractContextItem id0)
  {
    SetParent_21(id0);
  }

  private native long GetParent_22();
  public vtkAbstractContextItem GetParent()
  {
    long temp = GetParent_22();

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetVisible_23();
  public boolean GetVisible()
  {
    return GetVisible_23();
  }

  private native void SetVisible_24(boolean id0);
  public void SetVisible(boolean id0)
  {
    SetVisible_24(id0);
  }

  private native boolean GetInteractive_25();
  public boolean GetInteractive()
  {
    return GetInteractive_25();
  }

  private native void SetInteractive_26(boolean id0);
  public void SetInteractive(boolean id0)
  {
    SetInteractive_26(id0);
  }

  public vtkAbstractContextItem() { super(); }

  public vtkAbstractContextItem(long id) { super(id); }

}
