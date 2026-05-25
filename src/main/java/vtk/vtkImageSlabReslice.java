// java wrapper for vtkImageSlabReslice object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSlabReslice extends vtkImageReslice
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

  private native void SetBlendMode_4(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_4(id0);
  }

  private native int GetBlendMode_5();
  public int GetBlendMode()
  {
    return GetBlendMode_5();
  }

  private native void SetBlendModeToMin_6();
  public void SetBlendModeToMin()
  {
    SetBlendModeToMin_6();
  }

  private native void SetBlendModeToMax_7();
  public void SetBlendModeToMax()
  {
    SetBlendModeToMax_7();
  }

  private native void SetBlendModeToMean_8();
  public void SetBlendModeToMean()
  {
    SetBlendModeToMean_8();
  }

  private native int GetNumBlendSamplePoints_9();
  public int GetNumBlendSamplePoints()
  {
    return GetNumBlendSamplePoints_9();
  }

  private native void SetSlabThickness_10(double id0);
  public void SetSlabThickness(double id0)
  {
    SetSlabThickness_10(id0);
  }

  private native double GetSlabThickness_11();
  public double GetSlabThickness()
  {
    return GetSlabThickness_11();
  }

  private native void SetSlabResolution_12(double id0);
  public void SetSlabResolution(double id0)
  {
    SetSlabResolution_12(id0);
  }

  private native double GetSlabResolution_13();
  public double GetSlabResolution()
  {
    return GetSlabResolution_13();
  }

  public vtkImageSlabReslice() { super(); }

  public vtkImageSlabReslice(long id) { super(id); }
  public native long   VTKInit();

}
