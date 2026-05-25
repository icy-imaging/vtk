// java wrapper for vtkPlotRangeHandlesItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotRangeHandlesItem extends vtkPlot
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

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native void GetHandlesRange_6(double id0[]);
  public void GetHandlesRange(double id0[])
  {
    GetHandlesRange_6(id0);
  }

  private native void SetHandleWidth_7(float id0);
  public void SetHandleWidth(float id0)
  {
    SetHandleWidth_7(id0);
  }

  private native float GetHandleWidth_8();
  public float GetHandleWidth()
  {
    return GetHandleWidth_8();
  }

  private native void SetHandleOrientation_9(int id0);
  public void SetHandleOrientation(int id0)
  {
    SetHandleOrientation_9(id0);
  }

  private native int GetHandleOrientationMinValue_10();
  public int GetHandleOrientationMinValue()
  {
    return GetHandleOrientationMinValue_10();
  }

  private native int GetHandleOrientationMaxValue_11();
  public int GetHandleOrientationMaxValue()
  {
    return GetHandleOrientationMaxValue_11();
  }

  private native int GetHandleOrientation_12();
  public int GetHandleOrientation()
  {
    return GetHandleOrientation_12();
  }

  private native void SetHandleOrientationToVertical_13();
  public void SetHandleOrientationToVertical()
  {
    SetHandleOrientationToVertical_13();
  }

  private native void SetHandleOrientationToHorizontal_14();
  public void SetHandleOrientationToHorizontal()
  {
    SetHandleOrientationToHorizontal_14();
  }

  private native void SetExtent_15(double id0,double id1,double id2,double id3);
  public void SetExtent(double id0,double id1,double id2,double id3)
  {
    SetExtent_15(id0,id1,id2,id3);
  }

  private native void SetExtent_16(double id0[]);
  public void SetExtent(double id0[])
  {
    SetExtent_16(id0);
  }

  private native double[] GetExtent_17();
  public double[] GetExtent()
  {
    return GetExtent_17();
  }

  private native void SetExtentToAxisRange_18(int id0);
  public void SetExtentToAxisRange(int id0)
  {
    SetExtentToAxisRange_18(id0);
  }

  private native int GetExtentToAxisRange_19();
  public int GetExtentToAxisRange()
  {
    return GetExtentToAxisRange_19();
  }

  private native void ExtentToAxisRangeOn_20();
  public void ExtentToAxisRangeOn()
  {
    ExtentToAxisRangeOn_20();
  }

  private native void ExtentToAxisRangeOff_21();
  public void ExtentToAxisRangeOff()
  {
    ExtentToAxisRangeOff_21();
  }

  private native void SetSynchronizeRangeHandles_22(int id0);
  public void SetSynchronizeRangeHandles(int id0)
  {
    SetSynchronizeRangeHandles_22(id0);
  }

  private native int GetSynchronizeRangeHandles_23();
  public int GetSynchronizeRangeHandles()
  {
    return GetSynchronizeRangeHandles_23();
  }

  private native void SynchronizeRangeHandlesOn_24();
  public void SynchronizeRangeHandlesOn()
  {
    SynchronizeRangeHandlesOn_24();
  }

  private native void SynchronizeRangeHandlesOff_25();
  public void SynchronizeRangeHandlesOff()
  {
    SynchronizeRangeHandlesOff_25();
  }

  private native void SetLockTooltipToMouse_26(int id0);
  public void SetLockTooltipToMouse(int id0)
  {
    SetLockTooltipToMouse_26(id0);
  }

  private native int GetLockTooltipToMouse_27();
  public int GetLockTooltipToMouse()
  {
    return GetLockTooltipToMouse_27();
  }

  private native void LockTooltipToMouseOn_28();
  public void LockTooltipToMouseOn()
  {
    LockTooltipToMouseOn_28();
  }

  private native void LockTooltipToMouseOff_29();
  public void LockTooltipToMouseOff()
  {
    LockTooltipToMouseOff_29();
  }

  private native long GetHighlightBrush_30();
  public vtkBrush GetHighlightBrush()
  {
    long temp = GetHighlightBrush_30();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ComputeHandlesDrawRange_31();
  public void ComputeHandlesDrawRange()
  {
    ComputeHandlesDrawRange_31();
  }

  public vtkPlotRangeHandlesItem() { super(); }

  public vtkPlotRangeHandlesItem(long id) { super(id); }
  public native long   VTKInit();

}
