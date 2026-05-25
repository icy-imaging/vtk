// java wrapper for vtkImageInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageInterpolator extends vtkAbstractImageInterpolator
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

  private native void SetInterpolationMode_4(int id0);
  public void SetInterpolationMode(int id0)
  {
    SetInterpolationMode_4(id0);
  }

  private native void SetInterpolationModeToNearest_5();
  public void SetInterpolationModeToNearest()
  {
    SetInterpolationModeToNearest_5();
  }

  private native void SetInterpolationModeToLinear_6();
  public void SetInterpolationModeToLinear()
  {
    SetInterpolationModeToLinear_6();
  }

  private native void SetInterpolationModeToCubic_7();
  public void SetInterpolationModeToCubic()
  {
    SetInterpolationModeToCubic_7();
  }

  private native int GetInterpolationMode_8();
  public int GetInterpolationMode()
  {
    return GetInterpolationMode_8();
  }

  private native byte[] GetInterpolationModeAsString_9();
  public String GetInterpolationModeAsString()
  {
    return new String(GetInterpolationModeAsString_9(), StandardCharsets.UTF_8);
  }

  private native void ComputeSupportSize_10(double id0[],int id1[]);
  public void ComputeSupportSize(double id0[],int id1[])
  {
    ComputeSupportSize_10(id0,id1);
  }

  private native boolean IsSeparable_11();
  public boolean IsSeparable()
  {
    return IsSeparable_11();
  }

  public vtkImageInterpolator() { super(); }

  public vtkImageInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
