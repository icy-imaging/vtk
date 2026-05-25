// java wrapper for vtkIcicleView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIcicleView extends vtkTreeAreaView
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

  private native void SetTopToBottom_4(boolean id0);
  public void SetTopToBottom(boolean id0)
  {
    SetTopToBottom_4(id0);
  }

  private native boolean GetTopToBottom_5();
  public boolean GetTopToBottom()
  {
    return GetTopToBottom_5();
  }

  private native void TopToBottomOn_6();
  public void TopToBottomOn()
  {
    TopToBottomOn_6();
  }

  private native void TopToBottomOff_7();
  public void TopToBottomOff()
  {
    TopToBottomOff_7();
  }

  private native void SetRootWidth_8(double id0);
  public void SetRootWidth(double id0)
  {
    SetRootWidth_8(id0);
  }

  private native double GetRootWidth_9();
  public double GetRootWidth()
  {
    return GetRootWidth_9();
  }

  private native void SetLayerThickness_10(double id0);
  public void SetLayerThickness(double id0)
  {
    SetLayerThickness_10(id0);
  }

  private native double GetLayerThickness_11();
  public double GetLayerThickness()
  {
    return GetLayerThickness_11();
  }

  private native void SetUseGradientColoring_12(boolean id0);
  public void SetUseGradientColoring(boolean id0)
  {
    SetUseGradientColoring_12(id0);
  }

  private native boolean GetUseGradientColoring_13();
  public boolean GetUseGradientColoring()
  {
    return GetUseGradientColoring_13();
  }

  private native void UseGradientColoringOn_14();
  public void UseGradientColoringOn()
  {
    UseGradientColoringOn_14();
  }

  private native void UseGradientColoringOff_15();
  public void UseGradientColoringOff()
  {
    UseGradientColoringOff_15();
  }

  public vtkIcicleView() { super(); }

  public vtkIcicleView(long id) { super(id); }
  public native long   VTKInit();

}
