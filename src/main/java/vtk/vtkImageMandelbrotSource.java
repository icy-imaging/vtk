// java wrapper for vtkImageMandelbrotSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMandelbrotSource extends vtkImageAlgorithm
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

  private native void SetWholeExtent_4(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_4(id0);
  }

  private native void SetWholeExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetWholeExtent_6();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_6();
  }

  private native void SetConstantSize_7(int id0);
  public void SetConstantSize(int id0)
  {
    SetConstantSize_7(id0);
  }

  private native int GetConstantSize_8();
  public int GetConstantSize()
  {
    return GetConstantSize_8();
  }

  private native void ConstantSizeOn_9();
  public void ConstantSizeOn()
  {
    ConstantSizeOn_9();
  }

  private native void ConstantSizeOff_10();
  public void ConstantSizeOff()
  {
    ConstantSizeOff_10();
  }

  private native void SetProjectionAxes_11(int id0,int id1,int id2);
  public void SetProjectionAxes(int id0,int id1,int id2)
  {
    SetProjectionAxes_11(id0,id1,id2);
  }

  private native void SetProjectionAxes_12(int id0[]);
  public void SetProjectionAxes(int id0[])
  {
    SetProjectionAxes_12(id0);
  }

  private native int[] GetProjectionAxes_13();
  public int[] GetProjectionAxes()
  {
    return GetProjectionAxes_13();
  }

  private native void SetOriginCX_14(double id0,double id1,double id2,double id3);
  public void SetOriginCX(double id0,double id1,double id2,double id3)
  {
    SetOriginCX_14(id0,id1,id2,id3);
  }

  private native void SetOriginCX_15(double id0[]);
  public void SetOriginCX(double id0[])
  {
    SetOriginCX_15(id0);
  }

  private native double[] GetOriginCX_16();
  public double[] GetOriginCX()
  {
    return GetOriginCX_16();
  }

  private native void SetSampleCX_17(double id0,double id1,double id2,double id3);
  public void SetSampleCX(double id0,double id1,double id2,double id3)
  {
    SetSampleCX_17(id0,id1,id2,id3);
  }

  private native void SetSampleCX_18(double id0[]);
  public void SetSampleCX(double id0[])
  {
    SetSampleCX_18(id0);
  }

  private native double[] GetSampleCX_19();
  public double[] GetSampleCX()
  {
    return GetSampleCX_19();
  }

  private native void SetSizeCX_20(double id0,double id1,double id2,double id3);
  public void SetSizeCX(double id0,double id1,double id2,double id3)
  {
    SetSizeCX_20(id0,id1,id2,id3);
  }

  private native double[] GetSizeCX_21();
  public double[] GetSizeCX()
  {
    return GetSizeCX_21();
  }

  private native void GetSizeCX_22(double id0[]);
  public void GetSizeCX(double id0[])
  {
    GetSizeCX_22(id0);
  }

  private native void SetMaximumNumberOfIterations_23(short id0);
  public void SetMaximumNumberOfIterations(short id0)
  {
    SetMaximumNumberOfIterations_23(id0);
  }

  private native short GetMaximumNumberOfIterationsMinValue_24();
  public short GetMaximumNumberOfIterationsMinValue()
  {
    return GetMaximumNumberOfIterationsMinValue_24();
  }

  private native short GetMaximumNumberOfIterationsMaxValue_25();
  public short GetMaximumNumberOfIterationsMaxValue()
  {
    return GetMaximumNumberOfIterationsMaxValue_25();
  }

  private native short GetMaximumNumberOfIterations_26();
  public short GetMaximumNumberOfIterations()
  {
    return GetMaximumNumberOfIterations_26();
  }

  private native void Zoom_27(double id0);
  public void Zoom(double id0)
  {
    Zoom_27(id0);
  }

  private native void Pan_28(double id0,double id1,double id2);
  public void Pan(double id0,double id1,double id2)
  {
    Pan_28(id0,id1,id2);
  }

  private native void CopyOriginAndSample_29(vtkImageMandelbrotSource id0);
  public void CopyOriginAndSample(vtkImageMandelbrotSource id0)
  {
    CopyOriginAndSample_29(id0);
  }

  private native void SetSubsampleRate_30(int id0);
  public void SetSubsampleRate(int id0)
  {
    SetSubsampleRate_30(id0);
  }

  private native int GetSubsampleRateMinValue_31();
  public int GetSubsampleRateMinValue()
  {
    return GetSubsampleRateMinValue_31();
  }

  private native int GetSubsampleRateMaxValue_32();
  public int GetSubsampleRateMaxValue()
  {
    return GetSubsampleRateMaxValue_32();
  }

  private native int GetSubsampleRate_33();
  public int GetSubsampleRate()
  {
    return GetSubsampleRate_33();
  }

  public vtkImageMandelbrotSource() { super(); }

  public vtkImageMandelbrotSource(long id) { super(id); }
  public native long   VTKInit();

}
