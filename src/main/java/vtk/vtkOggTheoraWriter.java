// java wrapper for vtkOggTheoraWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOggTheoraWriter extends vtkGenericMovieWriter
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

  private native void Start_4();
  public void Start()
  {
    Start_4();
  }

  private native void Write_5();
  public void Write()
  {
    Write_5();
  }

  private native void End_6();
  public void End()
  {
    End_6();
  }

  private native void SetQuality_7(int id0);
  public void SetQuality(int id0)
  {
    SetQuality_7(id0);
  }

  private native int GetQualityMinValue_8();
  public int GetQualityMinValue()
  {
    return GetQualityMinValue_8();
  }

  private native int GetQualityMaxValue_9();
  public int GetQualityMaxValue()
  {
    return GetQualityMaxValue_9();
  }

  private native int GetQuality_10();
  public int GetQuality()
  {
    return GetQuality_10();
  }

  private native void SetRate_11(int id0);
  public void SetRate(int id0)
  {
    SetRate_11(id0);
  }

  private native int GetRateMinValue_12();
  public int GetRateMinValue()
  {
    return GetRateMinValue_12();
  }

  private native int GetRateMaxValue_13();
  public int GetRateMaxValue()
  {
    return GetRateMaxValue_13();
  }

  private native int GetRate_14();
  public int GetRate()
  {
    return GetRate_14();
  }

  private native void SetSubsampling_15(int id0);
  public void SetSubsampling(int id0)
  {
    SetSubsampling_15(id0);
  }

  private native int GetSubsampling_16();
  public int GetSubsampling()
  {
    return GetSubsampling_16();
  }

  private native void SubsamplingOn_17();
  public void SubsamplingOn()
  {
    SubsamplingOn_17();
  }

  private native void SubsamplingOff_18();
  public void SubsamplingOff()
  {
    SubsamplingOff_18();
  }

  public vtkOggTheoraWriter() { super(); }

  public vtkOggTheoraWriter(long id) { super(id); }
  public native long   VTKInit();

}
