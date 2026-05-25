// java wrapper for vtkFastSplatter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFastSplatter extends vtkImageAlgorithm
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

  private native void SetModelBounds_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_5(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_5(id0);
  }

  private native double[] GetModelBounds_6();
  public double[] GetModelBounds()
  {
    return GetModelBounds_6();
  }

  private native void SetOutputDimensions_7(int id0,int id1,int id2);
  public void SetOutputDimensions(int id0,int id1,int id2)
  {
    SetOutputDimensions_7(id0,id1,id2);
  }

  private native void SetOutputDimensions_8(int id0[]);
  public void SetOutputDimensions(int id0[])
  {
    SetOutputDimensions_8(id0);
  }

  private native int[] GetOutputDimensions_9();
  public int[] GetOutputDimensions()
  {
    return GetOutputDimensions_9();
  }

  private native void SetLimitMode_10(int id0);
  public void SetLimitMode(int id0)
  {
    SetLimitMode_10(id0);
  }

  private native int GetLimitMode_11();
  public int GetLimitMode()
  {
    return GetLimitMode_11();
  }

  private native void SetLimitModeToNone_12();
  public void SetLimitModeToNone()
  {
    SetLimitModeToNone_12();
  }

  private native void SetLimitModeToClamp_13();
  public void SetLimitModeToClamp()
  {
    SetLimitModeToClamp_13();
  }

  private native void SetLimitModeToScale_14();
  public void SetLimitModeToScale()
  {
    SetLimitModeToScale_14();
  }

  private native void SetLimitModeToFreezeScale_15();
  public void SetLimitModeToFreezeScale()
  {
    SetLimitModeToFreezeScale_15();
  }

  private native void SetMinValue_16(double id0);
  public void SetMinValue(double id0)
  {
    SetMinValue_16(id0);
  }

  private native double GetMinValue_17();
  public double GetMinValue()
  {
    return GetMinValue_17();
  }

  private native void SetMaxValue_18(double id0);
  public void SetMaxValue(double id0)
  {
    SetMaxValue_18(id0);
  }

  private native double GetMaxValue_19();
  public double GetMaxValue()
  {
    return GetMaxValue_19();
  }

  private native int GetNumberOfPointsSplatted_20();
  public int GetNumberOfPointsSplatted()
  {
    return GetNumberOfPointsSplatted_20();
  }

  private native void SetSplatConnection_21(vtkAlgorithmOutput id0);
  public void SetSplatConnection(vtkAlgorithmOutput id0)
  {
    SetSplatConnection_21(id0);
  }

  public vtkFastSplatter() { super(); }

  public vtkFastSplatter(long id) { super(id); }
  public native long   VTKInit();

}
