// java wrapper for vtkAMRGaussianPulseSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRGaussianPulseSource extends vtkOverlappingAMRAlgorithm
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

  private native void SetDimension_4(int id0);
  public void SetDimension(int id0)
  {
    SetDimension_4(id0);
  }

  private native void SetNumberOfLevels_5(int id0);
  public void SetNumberOfLevels(int id0)
  {
    SetNumberOfLevels_5(id0);
  }

  private native void SetRefinementRatio_6(int id0);
  public void SetRefinementRatio(int id0)
  {
    SetRefinementRatio_6(id0);
  }

  private native void SetRootSpacing_7(double id0);
  public void SetRootSpacing(double id0)
  {
    SetRootSpacing_7(id0);
  }

  private native void SetPulseOrigin_8(double id0,double id1,double id2);
  public void SetPulseOrigin(double id0,double id1,double id2)
  {
    SetPulseOrigin_8(id0,id1,id2);
  }

  private native void SetPulseOrigin_9(double id0[]);
  public void SetPulseOrigin(double id0[])
  {
    SetPulseOrigin_9(id0);
  }

  private native double[] GetPulseOrigin_10();
  public double[] GetPulseOrigin()
  {
    return GetPulseOrigin_10();
  }

  private native void SetXPulseOrigin_11(double id0);
  public void SetXPulseOrigin(double id0)
  {
    SetXPulseOrigin_11(id0);
  }

  private native void SetYPulseOrigin_12(double id0);
  public void SetYPulseOrigin(double id0)
  {
    SetYPulseOrigin_12(id0);
  }

  private native void SetZPulseOrigin_13(double id0);
  public void SetZPulseOrigin(double id0)
  {
    SetZPulseOrigin_13(id0);
  }

  private native void SetPulseWidth_14(double id0,double id1,double id2);
  public void SetPulseWidth(double id0,double id1,double id2)
  {
    SetPulseWidth_14(id0,id1,id2);
  }

  private native void SetPulseWidth_15(double id0[]);
  public void SetPulseWidth(double id0[])
  {
    SetPulseWidth_15(id0);
  }

  private native double[] GetPulseWidth_16();
  public double[] GetPulseWidth()
  {
    return GetPulseWidth_16();
  }

  private native void SetXPulseWidth_17(double id0);
  public void SetXPulseWidth(double id0)
  {
    SetXPulseWidth_17(id0);
  }

  private native void SetYPulseWidth_18(double id0);
  public void SetYPulseWidth(double id0)
  {
    SetYPulseWidth_18(id0);
  }

  private native void SetZPulseWidth_19(double id0);
  public void SetZPulseWidth(double id0)
  {
    SetZPulseWidth_19(id0);
  }

  private native void SetPulseAmplitude_20(double id0);
  public void SetPulseAmplitude(double id0)
  {
    SetPulseAmplitude_20(id0);
  }

  private native double GetPulseAmplitude_21();
  public double GetPulseAmplitude()
  {
    return GetPulseAmplitude_21();
  }

  public vtkAMRGaussianPulseSource() { super(); }

  public vtkAMRGaussianPulseSource(long id) { super(id); }
  public native long   VTKInit();

}
