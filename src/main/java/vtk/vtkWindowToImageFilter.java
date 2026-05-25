// java wrapper for vtkWindowToImageFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindowToImageFilter extends vtkAlgorithm
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

  private native void SetInput_4(vtkWindow id0);
  public void SetInput(vtkWindow id0)
  {
    SetInput_4(id0);
  }

  private native long GetInput_5();
  public vtkWindow GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScale_6(int id0,int id1);
  public void SetScale(int id0,int id1)
  {
    SetScale_6(id0,id1);
  }

  private native void SetScale_7(int id0[]);
  public void SetScale(int id0[])
  {
    SetScale_7(id0);
  }

  private native int[] GetScale_8();
  public int[] GetScale()
  {
    return GetScale_8();
  }

  private native void SetScale_9(int id0);
  public void SetScale(int id0)
  {
    SetScale_9(id0);
  }

  private native void SetFixBoundary_10(boolean id0);
  public void SetFixBoundary(boolean id0)
  {
    SetFixBoundary_10(id0);
  }

  private native boolean GetFixBoundary_11();
  public boolean GetFixBoundary()
  {
    return GetFixBoundary_11();
  }

  private native void FixBoundaryOn_12();
  public void FixBoundaryOn()
  {
    FixBoundaryOn_12();
  }

  private native void FixBoundaryOff_13();
  public void FixBoundaryOff()
  {
    FixBoundaryOff_13();
  }

  private native void ReadFrontBufferOn_14();
  public void ReadFrontBufferOn()
  {
    ReadFrontBufferOn_14();
  }

  private native void ReadFrontBufferOff_15();
  public void ReadFrontBufferOff()
  {
    ReadFrontBufferOff_15();
  }

  private native int GetReadFrontBuffer_16();
  public int GetReadFrontBuffer()
  {
    return GetReadFrontBuffer_16();
  }

  private native void SetReadFrontBuffer_17(int id0);
  public void SetReadFrontBuffer(int id0)
  {
    SetReadFrontBuffer_17(id0);
  }

  private native void ShouldRerenderOn_18();
  public void ShouldRerenderOn()
  {
    ShouldRerenderOn_18();
  }

  private native void ShouldRerenderOff_19();
  public void ShouldRerenderOff()
  {
    ShouldRerenderOff_19();
  }

  private native void SetShouldRerender_20(int id0);
  public void SetShouldRerender(int id0)
  {
    SetShouldRerender_20(id0);
  }

  private native int GetShouldRerender_21();
  public int GetShouldRerender()
  {
    return GetShouldRerender_21();
  }

  private native void SetViewport_22(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_22(id0,id1,id2,id3);
  }

  private native double[] GetViewport_23();
  public double[] GetViewport()
  {
    return GetViewport_23();
  }

  private native void SetInputBufferType_24(int id0);
  public void SetInputBufferType(int id0)
  {
    SetInputBufferType_24(id0);
  }

  private native int GetInputBufferType_25();
  public int GetInputBufferType()
  {
    return GetInputBufferType_25();
  }

  private native void SetInputBufferTypeToRGB_26();
  public void SetInputBufferTypeToRGB()
  {
    SetInputBufferTypeToRGB_26();
  }

  private native void SetInputBufferTypeToRGBA_27();
  public void SetInputBufferTypeToRGBA()
  {
    SetInputBufferTypeToRGBA_27();
  }

  private native void SetInputBufferTypeToZBuffer_28();
  public void SetInputBufferTypeToZBuffer()
  {
    SetInputBufferTypeToZBuffer_28();
  }

  private native long GetOutput_29();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_29();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkWindowToImageFilter() { super(); }

  public vtkWindowToImageFilter(long id) { super(id); }
  public native long   VTKInit();

}
