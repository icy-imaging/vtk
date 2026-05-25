// java wrapper for vtkRTAnalyticSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRTAnalyticSource extends vtkImageAlgorithm
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

  private native void SetWholeExtent_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_4(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetWholeExtent_5();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_5();
  }

  private native void SetCenter_6(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_6(id0,id1,id2);
  }

  private native void SetCenter_7(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_7(id0);
  }

  private native double[] GetCenter_8();
  public double[] GetCenter()
  {
    return GetCenter_8();
  }

  private native void SetMaximum_9(double id0);
  public void SetMaximum(double id0)
  {
    SetMaximum_9(id0);
  }

  private native double GetMaximum_10();
  public double GetMaximum()
  {
    return GetMaximum_10();
  }

  private native void SetStandardDeviation_11(double id0);
  public void SetStandardDeviation(double id0)
  {
    SetStandardDeviation_11(id0);
  }

  private native double GetStandardDeviation_12();
  public double GetStandardDeviation()
  {
    return GetStandardDeviation_12();
  }

  private native void SetXFreq_13(double id0);
  public void SetXFreq(double id0)
  {
    SetXFreq_13(id0);
  }

  private native double GetXFreq_14();
  public double GetXFreq()
  {
    return GetXFreq_14();
  }

  private native void SetYFreq_15(double id0);
  public void SetYFreq(double id0)
  {
    SetYFreq_15(id0);
  }

  private native double GetYFreq_16();
  public double GetYFreq()
  {
    return GetYFreq_16();
  }

  private native void SetZFreq_17(double id0);
  public void SetZFreq(double id0)
  {
    SetZFreq_17(id0);
  }

  private native double GetZFreq_18();
  public double GetZFreq()
  {
    return GetZFreq_18();
  }

  private native void SetXMag_19(double id0);
  public void SetXMag(double id0)
  {
    SetXMag_19(id0);
  }

  private native double GetXMag_20();
  public double GetXMag()
  {
    return GetXMag_20();
  }

  private native void SetYMag_21(double id0);
  public void SetYMag(double id0)
  {
    SetYMag_21(id0);
  }

  private native double GetYMag_22();
  public double GetYMag()
  {
    return GetYMag_22();
  }

  private native void SetZMag_23(double id0);
  public void SetZMag(double id0)
  {
    SetZMag_23(id0);
  }

  private native double GetZMag_24();
  public double GetZMag()
  {
    return GetZMag_24();
  }

  private native void SetSubsampleRate_25(int id0);
  public void SetSubsampleRate(int id0)
  {
    SetSubsampleRate_25(id0);
  }

  private native int GetSubsampleRate_26();
  public int GetSubsampleRate()
  {
    return GetSubsampleRate_26();
  }

  public vtkRTAnalyticSource() { super(); }

  public vtkRTAnalyticSource(long id) { super(id); }
  public native long   VTKInit();

}
