// java wrapper for vtkFixedPointRayCastImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFixedPointRayCastImage extends vtkObject
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

  private native void SetImageViewportSize_4(int id0,int id1);
  public void SetImageViewportSize(int id0,int id1)
  {
    SetImageViewportSize_4(id0,id1);
  }

  private native void SetImageViewportSize_5(int id0[]);
  public void SetImageViewportSize(int id0[])
  {
    SetImageViewportSize_5(id0);
  }

  private native int[] GetImageViewportSize_6();
  public int[] GetImageViewportSize()
  {
    return GetImageViewportSize_6();
  }

  private native void SetImageMemorySize_7(int id0,int id1);
  public void SetImageMemorySize(int id0,int id1)
  {
    SetImageMemorySize_7(id0,id1);
  }

  private native void SetImageMemorySize_8(int id0[]);
  public void SetImageMemorySize(int id0[])
  {
    SetImageMemorySize_8(id0);
  }

  private native int[] GetImageMemorySize_9();
  public int[] GetImageMemorySize()
  {
    return GetImageMemorySize_9();
  }

  private native void SetImageInUseSize_10(int id0,int id1);
  public void SetImageInUseSize(int id0,int id1)
  {
    SetImageInUseSize_10(id0,id1);
  }

  private native void SetImageInUseSize_11(int id0[]);
  public void SetImageInUseSize(int id0[])
  {
    SetImageInUseSize_11(id0);
  }

  private native int[] GetImageInUseSize_12();
  public int[] GetImageInUseSize()
  {
    return GetImageInUseSize_12();
  }

  private native void SetImageOrigin_13(int id0,int id1);
  public void SetImageOrigin(int id0,int id1)
  {
    SetImageOrigin_13(id0,id1);
  }

  private native void SetImageOrigin_14(int id0[]);
  public void SetImageOrigin(int id0[])
  {
    SetImageOrigin_14(id0);
  }

  private native int[] GetImageOrigin_15();
  public int[] GetImageOrigin()
  {
    return GetImageOrigin_15();
  }

  private native void SetImageSampleDistance_16(float id0);
  public void SetImageSampleDistance(float id0)
  {
    SetImageSampleDistance_16(id0);
  }

  private native float GetImageSampleDistance_17();
  public float GetImageSampleDistance()
  {
    return GetImageSampleDistance_17();
  }

  private native void AllocateImage_18();
  public void AllocateImage()
  {
    AllocateImage_18();
  }

  private native void ClearImage_19();
  public void ClearImage()
  {
    ClearImage_19();
  }

  private native void SetZBufferSize_20(int id0,int id1);
  public void SetZBufferSize(int id0,int id1)
  {
    SetZBufferSize_20(id0,id1);
  }

  private native void SetZBufferSize_21(int id0[]);
  public void SetZBufferSize(int id0[])
  {
    SetZBufferSize_21(id0);
  }

  private native int[] GetZBufferSize_22();
  public int[] GetZBufferSize()
  {
    return GetZBufferSize_22();
  }

  private native void SetZBufferOrigin_23(int id0,int id1);
  public void SetZBufferOrigin(int id0,int id1)
  {
    SetZBufferOrigin_23(id0,id1);
  }

  private native void SetZBufferOrigin_24(int id0[]);
  public void SetZBufferOrigin(int id0[])
  {
    SetZBufferOrigin_24(id0);
  }

  private native int[] GetZBufferOrigin_25();
  public int[] GetZBufferOrigin()
  {
    return GetZBufferOrigin_25();
  }

  private native void SetUseZBuffer_26(int id0);
  public void SetUseZBuffer(int id0)
  {
    SetUseZBuffer_26(id0);
  }

  private native int GetUseZBufferMinValue_27();
  public int GetUseZBufferMinValue()
  {
    return GetUseZBufferMinValue_27();
  }

  private native int GetUseZBufferMaxValue_28();
  public int GetUseZBufferMaxValue()
  {
    return GetUseZBufferMaxValue_28();
  }

  private native int GetUseZBuffer_29();
  public int GetUseZBuffer()
  {
    return GetUseZBuffer_29();
  }

  private native void UseZBufferOn_30();
  public void UseZBufferOn()
  {
    UseZBufferOn_30();
  }

  private native void UseZBufferOff_31();
  public void UseZBufferOff()
  {
    UseZBufferOff_31();
  }

  private native float GetZBufferValue_32(int id0,int id1);
  public float GetZBufferValue(int id0,int id1)
  {
    return GetZBufferValue_32(id0,id1);
  }

  private native void AllocateZBuffer_33();
  public void AllocateZBuffer()
  {
    AllocateZBuffer_33();
  }

  public vtkFixedPointRayCastImage() { super(); }

  public vtkFixedPointRayCastImage(long id) { super(id); }
  public native long   VTKInit();

}
