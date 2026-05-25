// java wrapper for vtkDynamic2DLabelMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDynamic2DLabelMapper extends vtkLabeledDataMapper
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

  private native void SetPriorityArrayName_4(byte[] id0, int len0);
  public void SetPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPriorityArrayName_4(bytes0, bytes0.length);
  }

  private native void SetReversePriority_5(boolean id0);
  public void SetReversePriority(boolean id0)
  {
    SetReversePriority_5(id0);
  }

  private native boolean GetReversePriority_6();
  public boolean GetReversePriority()
  {
    return GetReversePriority_6();
  }

  private native void ReversePriorityOn_7();
  public void ReversePriorityOn()
  {
    ReversePriorityOn_7();
  }

  private native void ReversePriorityOff_8();
  public void ReversePriorityOff()
  {
    ReversePriorityOff_8();
  }

  private native void SetLabelHeightPadding_9(float id0);
  public void SetLabelHeightPadding(float id0)
  {
    SetLabelHeightPadding_9(id0);
  }

  private native float GetLabelHeightPadding_10();
  public float GetLabelHeightPadding()
  {
    return GetLabelHeightPadding_10();
  }

  private native void SetLabelWidthPadding_11(float id0);
  public void SetLabelWidthPadding(float id0)
  {
    SetLabelWidthPadding_11(id0);
  }

  private native float GetLabelWidthPadding_12();
  public float GetLabelWidthPadding()
  {
    return GetLabelWidthPadding_12();
  }

  private native void RenderOpaqueGeometry_13(vtkViewport id0,vtkActor2D id1);
  public void RenderOpaqueGeometry(vtkViewport id0,vtkActor2D id1)
  {
    RenderOpaqueGeometry_13(id0,id1);
  }

  private native void RenderOverlay_14(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_14(id0,id1);
  }

  public vtkDynamic2DLabelMapper() { super(); }

  public vtkDynamic2DLabelMapper(long id) { super(id); }
  public native long   VTKInit();

}
