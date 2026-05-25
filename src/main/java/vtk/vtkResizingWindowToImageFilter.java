// java wrapper for vtkResizingWindowToImageFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResizingWindowToImageFilter extends vtkAlgorithm
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

  private native int[] GetSize_6();
  public int[] GetSize()
  {
    return GetSize_6();
  }

  private native void SetSize_7(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_7(id0,id1);
  }

  private native void SetSize_8(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_8(id0);
  }

  private native int GetSizeLimit_9();
  public int GetSizeLimit()
  {
    return GetSizeLimit_9();
  }

  private native void SetSizeLimit_10(int id0);
  public void SetSizeLimit(int id0)
  {
    SetSizeLimit_10(id0);
  }

  private native void SetInputBufferType_11(int id0);
  public void SetInputBufferType(int id0)
  {
    SetInputBufferType_11(id0);
  }

  private native int GetInputBufferType_12();
  public int GetInputBufferType()
  {
    return GetInputBufferType_12();
  }

  private native void SetInputBufferTypeToRGB_13();
  public void SetInputBufferTypeToRGB()
  {
    SetInputBufferTypeToRGB_13();
  }

  private native void SetInputBufferTypeToRGBA_14();
  public void SetInputBufferTypeToRGBA()
  {
    SetInputBufferTypeToRGBA_14();
  }

  private native void SetInputBufferTypeToZBuffer_15();
  public void SetInputBufferTypeToZBuffer()
  {
    SetInputBufferTypeToZBuffer_15();
  }

  private native long GetOutput_16();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_16();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkResizingWindowToImageFilter() { super(); }

  public vtkResizingWindowToImageFilter(long id) { super(id); }
  public native long   VTKInit();

}
