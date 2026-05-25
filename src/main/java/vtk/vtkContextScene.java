// java wrapper for vtkContextScene object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextScene extends vtkObject
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native int AddItem_5(vtkAbstractContextItem id0);
  public int AddItem(vtkAbstractContextItem id0)
  {
    return AddItem_5(id0);
  }

  private native boolean RemoveItem_6(vtkAbstractContextItem id0);
  public boolean RemoveItem(vtkAbstractContextItem id0)
  {
    return RemoveItem_6(id0);
  }

  private native boolean RemoveItem_7(int id0);
  public boolean RemoveItem(int id0)
  {
    return RemoveItem_7(id0);
  }

  private native long GetItem_8(int id0);
  public vtkAbstractContextItem GetItem(int id0)
  {
    long temp = GetItem_8(id0);

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfItems_9();
  public int GetNumberOfItems()
  {
    return GetNumberOfItems_9();
  }

  private native void ClearItems_10();
  public void ClearItems()
  {
    ClearItems_10();
  }

  private native void RemoveAllItems_11();
  public void RemoveAllItems()
  {
    RemoveAllItems_11();
  }

  private native void SetAnnotationLink_12(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_12(id0);
  }

  private native long GetAnnotationLink_13();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_13();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrigin_14(int id0,int id1);
  public void SetOrigin(int id0,int id1)
  {
    SetOrigin_14(id0,id1);
  }

  private native void SetOrigin_15(int id0[]);
  public void SetOrigin(int id0[])
  {
    SetOrigin_15(id0);
  }

  private native int[] GetOrigin_16();
  public int[] GetOrigin()
  {
    return GetOrigin_16();
  }

  private native void SetGeometry_17(int id0,int id1);
  public void SetGeometry(int id0,int id1)
  {
    SetGeometry_17(id0,id1);
  }

  private native void SetGeometry_18(int id0[]);
  public void SetGeometry(int id0[])
  {
    SetGeometry_18(id0);
  }

  private native int[] GetGeometry_19();
  public int[] GetGeometry()
  {
    return GetGeometry_19();
  }

  private native void SetUseBufferId_20(boolean id0);
  public void SetUseBufferId(boolean id0)
  {
    SetUseBufferId_20(id0);
  }

  private native boolean GetUseBufferId_21();
  public boolean GetUseBufferId()
  {
    return GetUseBufferId_21();
  }

  private native int GetViewWidth_22();
  public int GetViewWidth()
  {
    return GetViewWidth_22();
  }

  private native int GetViewHeight_23();
  public int GetViewHeight()
  {
    return GetViewHeight_23();
  }

  private native int GetSceneLeft_24();
  public int GetSceneLeft()
  {
    return GetSceneLeft_24();
  }

  private native int GetSceneBottom_25();
  public int GetSceneBottom()
  {
    return GetSceneBottom_25();
  }

  private native int GetSceneWidth_26();
  public int GetSceneWidth()
  {
    return GetSceneWidth_26();
  }

  private native int GetSceneHeight_27();
  public int GetSceneHeight()
  {
    return GetSceneHeight_27();
  }

  private native void SetScaleTiles_28(boolean id0);
  public void SetScaleTiles(boolean id0)
  {
    SetScaleTiles_28(id0);
  }

  private native boolean GetScaleTiles_29();
  public boolean GetScaleTiles()
  {
    return GetScaleTiles_29();
  }

  private native void ScaleTilesOn_30();
  public void ScaleTilesOn()
  {
    ScaleTilesOn_30();
  }

  private native void ScaleTilesOff_31();
  public void ScaleTilesOff()
  {
    ScaleTilesOff_31();
  }

  private native void SetRenderer_32(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_32(id0);
  }

  private native long GetRenderer_33();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_33();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDirty_34(boolean id0);
  public void SetDirty(boolean id0)
  {
    SetDirty_34(id0);
  }

  private native boolean GetDirty_35();
  public boolean GetDirty()
  {
    return GetDirty_35();
  }

  private native void ReleaseGraphicsResources_36();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_36();
  }

  private native long GetBufferId_37();
  public vtkAbstractContextBufferId GetBufferId()
  {
    long temp = GetBufferId_37();

    if (temp == 0) return null;
    return (vtkAbstractContextBufferId)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_38(vtkTransform2D id0);
  public void SetTransform(vtkTransform2D id0)
  {
    SetTransform_38(id0);
  }

  private native long GetTransform_39();
  public vtkTransform2D GetTransform()
  {
    long temp = GetTransform_39();

    if (temp == 0) return null;
    return (vtkTransform2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasTransform_40();
  public boolean HasTransform()
  {
    return HasTransform_40();
  }

  private native long GetPickedItem_41(int id0,int id1);
  public long GetPickedItem(int id0,int id1)
  {
    return GetPickedItem_41(id0,id1);
  }

  private native long GetPickedItem_42();
  public vtkAbstractContextItem GetPickedItem()
  {
    long temp = GetPickedItem_42();

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkContextScene() { super(); }

  public vtkContextScene(long id) { super(id); }
  public native long   VTKInit();

}
