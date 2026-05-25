// java wrapper for vtkImageFlip object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageFlip extends vtkImageReslice
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

  private native void SetFilteredAxis_4(int id0);
  public void SetFilteredAxis(int id0)
  {
    SetFilteredAxis_4(id0);
  }

  private native int GetFilteredAxis_5();
  public int GetFilteredAxis()
  {
    return GetFilteredAxis_5();
  }

  private native void SetFlipAboutOrigin_6(int id0);
  public void SetFlipAboutOrigin(int id0)
  {
    SetFlipAboutOrigin_6(id0);
  }

  private native int GetFlipAboutOrigin_7();
  public int GetFlipAboutOrigin()
  {
    return GetFlipAboutOrigin_7();
  }

  private native void FlipAboutOriginOn_8();
  public void FlipAboutOriginOn()
  {
    FlipAboutOriginOn_8();
  }

  private native void FlipAboutOriginOff_9();
  public void FlipAboutOriginOff()
  {
    FlipAboutOriginOff_9();
  }

  private native void SetFilteredAxes_10(int id0);
  public void SetFilteredAxes(int id0)
  {
    SetFilteredAxes_10(id0);
  }

  private native int GetFilteredAxes_11();
  public int GetFilteredAxes()
  {
    return GetFilteredAxes_11();
  }

  private native void SetPreserveImageExtent_12(int id0);
  public void SetPreserveImageExtent(int id0)
  {
    SetPreserveImageExtent_12(id0);
  }

  private native int GetPreserveImageExtent_13();
  public int GetPreserveImageExtent()
  {
    return GetPreserveImageExtent_13();
  }

  private native void PreserveImageExtentOn_14();
  public void PreserveImageExtentOn()
  {
    PreserveImageExtentOn_14();
  }

  private native void PreserveImageExtentOff_15();
  public void PreserveImageExtentOff()
  {
    PreserveImageExtentOff_15();
  }

  public vtkImageFlip() { super(); }

  public vtkImageFlip(long id) { super(id); }
  public native long   VTKInit();

}
