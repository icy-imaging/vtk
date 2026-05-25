// java wrapper for vtkVideoSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVideoSource extends vtkImageAlgorithm
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

  private native void Record_4();
  public void Record()
  {
    Record_4();
  }

  private native void Play_5();
  public void Play()
  {
    Play_5();
  }

  private native void Stop_6();
  public void Stop()
  {
    Stop_6();
  }

  private native void Rewind_7();
  public void Rewind()
  {
    Rewind_7();
  }

  private native void FastForward_8();
  public void FastForward()
  {
    FastForward_8();
  }

  private native void Seek_9(int id0);
  public void Seek(int id0)
  {
    Seek_9(id0);
  }

  private native void Grab_10();
  public void Grab()
  {
    Grab_10();
  }

  private native int GetRecording_11();
  public int GetRecording()
  {
    return GetRecording_11();
  }

  private native int GetPlaying_12();
  public int GetPlaying()
  {
    return GetPlaying_12();
  }

  private native void SetFrameSize_13(int id0,int id1,int id2);
  public void SetFrameSize(int id0,int id1,int id2)
  {
    SetFrameSize_13(id0,id1,id2);
  }

  private native void SetFrameSize_14(int id0[]);
  public void SetFrameSize(int id0[])
  {
    SetFrameSize_14(id0);
  }

  private native int[] GetFrameSize_15();
  public int[] GetFrameSize()
  {
    return GetFrameSize_15();
  }

  private native void SetFrameRate_16(float id0);
  public void SetFrameRate(float id0)
  {
    SetFrameRate_16(id0);
  }

  private native float GetFrameRate_17();
  public float GetFrameRate()
  {
    return GetFrameRate_17();
  }

  private native void SetOutputFormat_18(int id0);
  public void SetOutputFormat(int id0)
  {
    SetOutputFormat_18(id0);
  }

  private native void SetOutputFormatToLuminance_19();
  public void SetOutputFormatToLuminance()
  {
    SetOutputFormatToLuminance_19();
  }

  private native void SetOutputFormatToRGB_20();
  public void SetOutputFormatToRGB()
  {
    SetOutputFormatToRGB_20();
  }

  private native void SetOutputFormatToRGBA_21();
  public void SetOutputFormatToRGBA()
  {
    SetOutputFormatToRGBA_21();
  }

  private native int GetOutputFormat_22();
  public int GetOutputFormat()
  {
    return GetOutputFormat_22();
  }

  private native void SetFrameBufferSize_23(int id0);
  public void SetFrameBufferSize(int id0)
  {
    SetFrameBufferSize_23(id0);
  }

  private native int GetFrameBufferSize_24();
  public int GetFrameBufferSize()
  {
    return GetFrameBufferSize_24();
  }

  private native void SetNumberOfOutputFrames_25(int id0);
  public void SetNumberOfOutputFrames(int id0)
  {
    SetNumberOfOutputFrames_25(id0);
  }

  private native int GetNumberOfOutputFrames_26();
  public int GetNumberOfOutputFrames()
  {
    return GetNumberOfOutputFrames_26();
  }

  private native void AutoAdvanceOn_27();
  public void AutoAdvanceOn()
  {
    AutoAdvanceOn_27();
  }

  private native void AutoAdvanceOff_28();
  public void AutoAdvanceOff()
  {
    AutoAdvanceOff_28();
  }

  private native void SetAutoAdvance_29(int id0);
  public void SetAutoAdvance(int id0)
  {
    SetAutoAdvance_29(id0);
  }

  private native int GetAutoAdvance_30();
  public int GetAutoAdvance()
  {
    return GetAutoAdvance_30();
  }

  private native void SetClipRegion_31(int id0[]);
  public void SetClipRegion(int id0[])
  {
    SetClipRegion_31(id0);
  }

  private native void SetClipRegion_32(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetClipRegion(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetClipRegion_32(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetClipRegion_33();
  public int[] GetClipRegion()
  {
    return GetClipRegion_33();
  }

  private native void SetOutputWholeExtent_34(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetOutputWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetOutputWholeExtent_34(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOutputWholeExtent_35(int id0[]);
  public void SetOutputWholeExtent(int id0[])
  {
    SetOutputWholeExtent_35(id0);
  }

  private native int[] GetOutputWholeExtent_36();
  public int[] GetOutputWholeExtent()
  {
    return GetOutputWholeExtent_36();
  }

  private native void SetDataSpacing_37(double id0,double id1,double id2);
  public void SetDataSpacing(double id0,double id1,double id2)
  {
    SetDataSpacing_37(id0,id1,id2);
  }

  private native void SetDataSpacing_38(double id0[]);
  public void SetDataSpacing(double id0[])
  {
    SetDataSpacing_38(id0);
  }

  private native double[] GetDataSpacing_39();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_39();
  }

  private native void SetDataOrigin_40(double id0,double id1,double id2);
  public void SetDataOrigin(double id0,double id1,double id2)
  {
    SetDataOrigin_40(id0,id1,id2);
  }

  private native void SetDataOrigin_41(double id0[]);
  public void SetDataOrigin(double id0[])
  {
    SetDataOrigin_41(id0);
  }

  private native double[] GetDataOrigin_42();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_42();
  }

  private native void SetOpacity_43(float id0);
  public void SetOpacity(float id0)
  {
    SetOpacity_43(id0);
  }

  private native float GetOpacity_44();
  public float GetOpacity()
  {
    return GetOpacity_44();
  }

  private native int GetFrameCount_45();
  public int GetFrameCount()
  {
    return GetFrameCount_45();
  }

  private native void SetFrameCount_46(int id0);
  public void SetFrameCount(int id0)
  {
    SetFrameCount_46(id0);
  }

  private native int GetFrameIndex_47();
  public int GetFrameIndex()
  {
    return GetFrameIndex_47();
  }

  private native double GetFrameTimeStamp_48(int id0);
  public double GetFrameTimeStamp(int id0)
  {
    return GetFrameTimeStamp_48(id0);
  }

  private native double GetFrameTimeStamp_49();
  public double GetFrameTimeStamp()
  {
    return GetFrameTimeStamp_49();
  }

  private native void Initialize_50();
  public void Initialize()
  {
    Initialize_50();
  }

  private native int GetInitialized_51();
  public int GetInitialized()
  {
    return GetInitialized_51();
  }

  private native void ReleaseSystemResources_52();
  public void ReleaseSystemResources()
  {
    ReleaseSystemResources_52();
  }

  private native void InternalGrab_53();
  public void InternalGrab()
  {
    InternalGrab_53();
  }

  private native void SetStartTimeStamp_54(double id0);
  public void SetStartTimeStamp(double id0)
  {
    SetStartTimeStamp_54(id0);
  }

  private native double GetStartTimeStamp_55();
  public double GetStartTimeStamp()
  {
    return GetStartTimeStamp_55();
  }

  public vtkVideoSource() { super(); }

  public vtkVideoSource(long id) { super(id); }
  public native long   VTKInit();

}
