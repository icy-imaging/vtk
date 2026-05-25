// java wrapper for vtkImageSSIM object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSSIM extends vtkThreadedImageAlgorithm
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

  private native void SetImageConnection_4(vtkAlgorithmOutput id0);
  public void SetImageConnection(vtkAlgorithmOutput id0)
  {
    SetImageConnection_4(id0);
  }

  private native void SetImageData_5(vtkDataObject id0);
  public void SetImageData(vtkDataObject id0)
  {
    SetImageData_5(id0);
  }

  private native void SetInputToLab_6();
  public void SetInputToLab()
  {
    SetInputToLab_6();
  }

  private native void SetInputToRGB_7();
  public void SetInputToRGB()
  {
    SetInputToRGB_7();
  }

  private native void SetInputToRGBA_8();
  public void SetInputToRGBA()
  {
    SetInputToRGBA_8();
  }

  private native void SetInputToGrayscale_9();
  public void SetInputToGrayscale()
  {
    SetInputToGrayscale_9();
  }

  private native void SetInputToAuto_10();
  public void SetInputToAuto()
  {
    SetInputToAuto_10();
  }

  private native void SetClampNegativeValues_11(boolean id0);
  public void SetClampNegativeValues(boolean id0)
  {
    SetClampNegativeValues_11(id0);
  }

  private native boolean GetClampNegativeValues_12();
  public boolean GetClampNegativeValues()
  {
    return GetClampNegativeValues_12();
  }

  private native void ClampNegativeValuesOn_13();
  public void ClampNegativeValuesOn()
  {
    ClampNegativeValuesOn_13();
  }

  private native void ClampNegativeValuesOff_14();
  public void ClampNegativeValuesOff()
  {
    ClampNegativeValuesOff_14();
  }

  private native void SetPatchRadius_15(double id0);
  public void SetPatchRadius(double id0)
  {
    SetPatchRadius_15(id0);
  }

  private native double GetPatchRadius_16();
  public double GetPatchRadius()
  {
    return GetPatchRadius_16();
  }

  public vtkImageSSIM() { super(); }

  public vtkImageSSIM(long id) { super(id); }
  public native long   VTKInit();

}
