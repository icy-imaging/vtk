// java wrapper for vtkImageStencil object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageStencil extends vtkThreadedImageAlgorithm
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

  private native void SetStencilData_4(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_4(id0);
  }

  private native long GetStencil_5();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_5();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStencilConnection_6(vtkAlgorithmOutput id0);
  public void SetStencilConnection(vtkAlgorithmOutput id0)
  {
    SetStencilConnection_6(id0);
  }

  private native void SetReverseStencil_7(int id0);
  public void SetReverseStencil(int id0)
  {
    SetReverseStencil_7(id0);
  }

  private native void ReverseStencilOn_8();
  public void ReverseStencilOn()
  {
    ReverseStencilOn_8();
  }

  private native void ReverseStencilOff_9();
  public void ReverseStencilOff()
  {
    ReverseStencilOff_9();
  }

  private native int GetReverseStencil_10();
  public int GetReverseStencil()
  {
    return GetReverseStencil_10();
  }

  private native void SetBackgroundInputData_11(vtkImageData id0);
  public void SetBackgroundInputData(vtkImageData id0)
  {
    SetBackgroundInputData_11(id0);
  }

  private native long GetBackgroundInput_12();
  public vtkImageData GetBackgroundInput()
  {
    long temp = GetBackgroundInput_12();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackgroundValue_13(double id0);
  public void SetBackgroundValue(double id0)
  {
    SetBackgroundValue_13(id0);
  }

  private native double GetBackgroundValue_14();
  public double GetBackgroundValue()
  {
    return GetBackgroundValue_14();
  }

  private native void SetBackgroundColor_15(double id0,double id1,double id2,double id3);
  public void SetBackgroundColor(double id0,double id1,double id2,double id3)
  {
    SetBackgroundColor_15(id0,id1,id2,id3);
  }

  private native void SetBackgroundColor_16(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_16(id0);
  }

  private native double[] GetBackgroundColor_17();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_17();
  }

  public vtkImageStencil() { super(); }

  public vtkImageStencil(long id) { super(id); }
  public native long   VTKInit();

}
