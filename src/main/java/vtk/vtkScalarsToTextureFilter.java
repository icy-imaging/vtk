// java wrapper for vtkScalarsToTextureFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarsToTextureFilter extends vtkPolyDataAlgorithm
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

  private native void SetTransferFunction_4(vtkScalarsToColors id0);
  public void SetTransferFunction(vtkScalarsToColors id0)
  {
    SetTransferFunction_4(id0);
  }

  private native long GetTransferFunction_5();
  public vtkScalarsToColors GetTransferFunction()
  {
    long temp = GetTransferFunction_5();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetUseTransferFunction_6();
  public boolean GetUseTransferFunction()
  {
    return GetUseTransferFunction_6();
  }

  private native void SetUseTransferFunction_7(boolean id0);
  public void SetUseTransferFunction(boolean id0)
  {
    SetUseTransferFunction_7(id0);
  }

  private native void UseTransferFunctionOn_8();
  public void UseTransferFunctionOn()
  {
    UseTransferFunctionOn_8();
  }

  private native void UseTransferFunctionOff_9();
  public void UseTransferFunctionOff()
  {
    UseTransferFunctionOff_9();
  }

  private native void SetTextureDimensions_10(int id0,int id1);
  public void SetTextureDimensions(int id0,int id1)
  {
    SetTextureDimensions_10(id0,id1);
  }

  private native void SetTextureDimensions_11(int id0[]);
  public void SetTextureDimensions(int id0[])
  {
    SetTextureDimensions_11(id0);
  }

  private native int[] GetTextureDimensions_12();
  public int[] GetTextureDimensions()
  {
    return GetTextureDimensions_12();
  }

  public vtkScalarsToTextureFilter() { super(); }

  public vtkScalarsToTextureFilter(long id) { super(id); }
  public native long   VTKInit();

}
