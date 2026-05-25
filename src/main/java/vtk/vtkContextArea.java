// java wrapper for vtkContextArea object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextArea extends vtkAbstractContextItem
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

  private native long GetAxis_4(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_4(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDrawAreaItem_5();
  public vtkAbstractContextItem GetDrawAreaItem()
  {
    long temp = GetDrawAreaItem_5();

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean Paint_6(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_6(id0);
  }

  private native int GetDrawAreaResizeBehavior_7();
  public int GetDrawAreaResizeBehavior()
  {
    return GetDrawAreaResizeBehavior_7();
  }

  private native void SetDrawAreaResizeBehavior_8(int id0);
  public void SetDrawAreaResizeBehavior(int id0)
  {
    SetDrawAreaResizeBehavior_8(id0);
  }

  private native float GetFixedAspect_9();
  public float GetFixedAspect()
  {
    return GetFixedAspect_9();
  }

  private native void SetFixedAspect_10(float id0);
  public void SetFixedAspect(float id0)
  {
    SetFixedAspect_10(id0);
  }

  private native void SetFixedRect_11(int id0,int id1,int id2,int id3);
  public void SetFixedRect(int id0,int id1,int id2,int id3)
  {
    SetFixedRect_11(id0,id1,id2,id3);
  }

  private native void GetFixedMarginsArray_12(int id0[]);
  public void GetFixedMarginsArray(int id0[])
  {
    GetFixedMarginsArray_12(id0);
  }

  private native void SetFixedMargins_13(int id0[]);
  public void SetFixedMargins(int id0[])
  {
    SetFixedMargins_13(id0);
  }

  private native void SetFixedMargins_14(int id0,int id1,int id2,int id3);
  public void SetFixedMargins(int id0,int id1,int id2,int id3)
  {
    SetFixedMargins_14(id0,id1,id2,id3);
  }

  private native boolean GetFillViewport_15();
  public boolean GetFillViewport()
  {
    return GetFillViewport_15();
  }

  private native void SetFillViewport_16(boolean id0);
  public void SetFillViewport(boolean id0)
  {
    SetFillViewport_16(id0);
  }

  private native void FillViewportOn_17();
  public void FillViewportOn()
  {
    FillViewportOn_17();
  }

  private native void FillViewportOff_18();
  public void FillViewportOff()
  {
    FillViewportOff_18();
  }

  private native void SetShowGrid_19(boolean id0);
  public void SetShowGrid(boolean id0)
  {
    SetShowGrid_19(id0);
  }

  private native boolean GetShowGrid_20();
  public boolean GetShowGrid()
  {
    return GetShowGrid_20();
  }

  private native void ShowGridOn_21();
  public void ShowGridOn()
  {
    ShowGridOn_21();
  }

  private native void ShowGridOff_22();
  public void ShowGridOff()
  {
    ShowGridOff_22();
  }

  public vtkContextArea() { super(); }

  public vtkContextArea(long id) { super(id); }
  public native long   VTKInit();

}
