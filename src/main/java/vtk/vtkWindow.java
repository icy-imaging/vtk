// java wrapper for vtkWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindow extends vtkObject
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

  private native void SetWindowInfo_4(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_4(bytes0, bytes0.length);
  }

  private native void SetParentInfo_5(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_5(bytes0, bytes0.length);
  }

  private native boolean EnsureDisplay_6();
  public boolean EnsureDisplay()
  {
    return EnsureDisplay_6();
  }

  private native int[] GetPosition_7();
  public int[] GetPosition()
  {
    return GetPosition_7();
  }

  private native void SetPosition_8(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_8(id0,id1);
  }

  private native void SetPosition_9(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_9(id0);
  }

  private native int[] GetSize_10();
  public int[] GetSize()
  {
    return GetSize_10();
  }

  private native void SetSize_11(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_11(id0,id1);
  }

  private native void SetSize_12(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_12(id0);
  }

  private native int[] GetActualSize_13();
  public int[] GetActualSize()
  {
    return GetActualSize_13();
  }

  private native int[] GetScreenSize_14();
  public int[] GetScreenSize()
  {
    return GetScreenSize_14();
  }

  private native int GetMapped_15();
  public int GetMapped()
  {
    return GetMapped_15();
  }

  private native boolean GetShowWindow_16();
  public boolean GetShowWindow()
  {
    return GetShowWindow_16();
  }

  private native void SetShowWindow_17(boolean id0);
  public void SetShowWindow(boolean id0)
  {
    SetShowWindow_17(id0);
  }

  private native void ShowWindowOn_18();
  public void ShowWindowOn()
  {
    ShowWindowOn_18();
  }

  private native void ShowWindowOff_19();
  public void ShowWindowOff()
  {
    ShowWindowOff_19();
  }

  private native void SetUseOffScreenBuffers_20(boolean id0);
  public void SetUseOffScreenBuffers(boolean id0)
  {
    SetUseOffScreenBuffers_20(id0);
  }

  private native boolean GetUseOffScreenBuffers_21();
  public boolean GetUseOffScreenBuffers()
  {
    return GetUseOffScreenBuffers_21();
  }

  private native void UseOffScreenBuffersOn_22();
  public void UseOffScreenBuffersOn()
  {
    UseOffScreenBuffersOn_22();
  }

  private native void UseOffScreenBuffersOff_23();
  public void UseOffScreenBuffersOff()
  {
    UseOffScreenBuffersOff_23();
  }

  private native void SetErase_24(int id0);
  public void SetErase(int id0)
  {
    SetErase_24(id0);
  }

  private native int GetErase_25();
  public int GetErase()
  {
    return GetErase_25();
  }

  private native void EraseOn_26();
  public void EraseOn()
  {
    EraseOn_26();
  }

  private native void EraseOff_27();
  public void EraseOff()
  {
    EraseOff_27();
  }

  private native void SetDoubleBuffer_28(int id0);
  public void SetDoubleBuffer(int id0)
  {
    SetDoubleBuffer_28(id0);
  }

  private native int GetDoubleBuffer_29();
  public int GetDoubleBuffer()
  {
    return GetDoubleBuffer_29();
  }

  private native void DoubleBufferOn_30();
  public void DoubleBufferOn()
  {
    DoubleBufferOn_30();
  }

  private native void DoubleBufferOff_31();
  public void DoubleBufferOff()
  {
    DoubleBufferOff_31();
  }

  private native byte[] GetWindowName_32();
  public String GetWindowName()
  {
    return new String(GetWindowName_32(), StandardCharsets.UTF_8);
  }

  private native void SetWindowName_33(byte[] id0, int len0);
  public void SetWindowName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowName_33(bytes0, bytes0.length);
  }

  private native void Render_34();
  public void Render()
  {
    Render_34();
  }

  private native void ReleaseGraphicsResources_35(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_35(id0);
  }

  private native int GetPixelData_36(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetPixelData_36(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetDPI_37();
  public int GetDPI()
  {
    return GetDPI_37();
  }

  private native void SetDPI_38(int id0);
  public void SetDPI(int id0)
  {
    SetDPI_38(id0);
  }

  private native int GetDPIMinValue_39();
  public int GetDPIMinValue()
  {
    return GetDPIMinValue_39();
  }

  private native int GetDPIMaxValue_40();
  public int GetDPIMaxValue()
  {
    return GetDPIMaxValue_40();
  }

  private native boolean DetectDPI_41();
  public boolean DetectDPI()
  {
    return DetectDPI_41();
  }

  private native void SetOffScreenRendering_42(int id0);
  public void SetOffScreenRendering(int id0)
  {
    SetOffScreenRendering_42(id0);
  }

  private native void OffScreenRenderingOn_43();
  public void OffScreenRenderingOn()
  {
    OffScreenRenderingOn_43();
  }

  private native void OffScreenRenderingOff_44();
  public void OffScreenRenderingOff()
  {
    OffScreenRenderingOff_44();
  }

  private native int GetOffScreenRendering_45();
  public int GetOffScreenRendering()
  {
    return GetOffScreenRendering_45();
  }

  private native void MakeCurrent_46();
  public void MakeCurrent()
  {
    MakeCurrent_46();
  }

  private native void ReleaseCurrent_47();
  public void ReleaseCurrent()
  {
    ReleaseCurrent_47();
  }

  private native void SetTileScale_48(int id0,int id1);
  public void SetTileScale(int id0,int id1)
  {
    SetTileScale_48(id0,id1);
  }

  private native void SetTileScale_49(int id0[]);
  public void SetTileScale(int id0[])
  {
    SetTileScale_49(id0);
  }

  private native int[] GetTileScale_50();
  public int[] GetTileScale()
  {
    return GetTileScale_50();
  }

  private native void SetTileScale_51(int id0);
  public void SetTileScale(int id0)
  {
    SetTileScale_51(id0);
  }

  private native void SetTileViewport_52(double id0,double id1,double id2,double id3);
  public void SetTileViewport(double id0,double id1,double id2,double id3)
  {
    SetTileViewport_52(id0,id1,id2,id3);
  }

  private native void SetTileViewport_53(double id0[]);
  public void SetTileViewport(double id0[])
  {
    SetTileViewport_53(id0);
  }

  private native double[] GetTileViewport_54();
  public double[] GetTileViewport()
  {
    return GetTileViewport_54();
  }

  public vtkWindow() { super(); }

  public vtkWindow(long id) { super(id); }

}
