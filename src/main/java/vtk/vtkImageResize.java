// java wrapper for vtkImageResize object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageResize extends vtkThreadedImageAlgorithm
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

  private native void SetResizeMethod_4(int id0);
  public void SetResizeMethod(int id0)
  {
    SetResizeMethod_4(id0);
  }

  private native int GetResizeMethodMinValue_5();
  public int GetResizeMethodMinValue()
  {
    return GetResizeMethodMinValue_5();
  }

  private native int GetResizeMethodMaxValue_6();
  public int GetResizeMethodMaxValue()
  {
    return GetResizeMethodMaxValue_6();
  }

  private native int GetResizeMethod_7();
  public int GetResizeMethod()
  {
    return GetResizeMethod_7();
  }

  private native void SetResizeMethodToOutputDimensions_8();
  public void SetResizeMethodToOutputDimensions()
  {
    SetResizeMethodToOutputDimensions_8();
  }

  private native void SetResizeMethodToOutputSpacing_9();
  public void SetResizeMethodToOutputSpacing()
  {
    SetResizeMethodToOutputSpacing_9();
  }

  private native void SetResizeMethodToMagnificationFactors_10();
  public void SetResizeMethodToMagnificationFactors()
  {
    SetResizeMethodToMagnificationFactors_10();
  }

  private native byte[] GetResizeMethodAsString_11();
  public String GetResizeMethodAsString()
  {
    return new String(GetResizeMethodAsString_11(), StandardCharsets.UTF_8);
  }

  private native void SetOutputDimensions_12(int id0,int id1,int id2);
  public void SetOutputDimensions(int id0,int id1,int id2)
  {
    SetOutputDimensions_12(id0,id1,id2);
  }

  private native void SetOutputDimensions_13(int id0[]);
  public void SetOutputDimensions(int id0[])
  {
    SetOutputDimensions_13(id0);
  }

  private native int[] GetOutputDimensions_14();
  public int[] GetOutputDimensions()
  {
    return GetOutputDimensions_14();
  }

  private native void SetOutputSpacing_15(double id0,double id1,double id2);
  public void SetOutputSpacing(double id0,double id1,double id2)
  {
    SetOutputSpacing_15(id0,id1,id2);
  }

  private native void SetOutputSpacing_16(double id0[]);
  public void SetOutputSpacing(double id0[])
  {
    SetOutputSpacing_16(id0);
  }

  private native double[] GetOutputSpacing_17();
  public double[] GetOutputSpacing()
  {
    return GetOutputSpacing_17();
  }

  private native void SetMagnificationFactors_18(double id0,double id1,double id2);
  public void SetMagnificationFactors(double id0,double id1,double id2)
  {
    SetMagnificationFactors_18(id0,id1,id2);
  }

  private native void SetMagnificationFactors_19(double id0[]);
  public void SetMagnificationFactors(double id0[])
  {
    SetMagnificationFactors_19(id0);
  }

  private native double[] GetMagnificationFactors_20();
  public double[] GetMagnificationFactors()
  {
    return GetMagnificationFactors_20();
  }

  private native void SetBorder_21(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_21(id0);
  }

  private native void BorderOn_22();
  public void BorderOn()
  {
    BorderOn_22();
  }

  private native void BorderOff_23();
  public void BorderOff()
  {
    BorderOff_23();
  }

  private native int GetBorder_24();
  public int GetBorder()
  {
    return GetBorder_24();
  }

  private native void SetCropping_25(int id0);
  public void SetCropping(int id0)
  {
    SetCropping_25(id0);
  }

  private native void CroppingOn_26();
  public void CroppingOn()
  {
    CroppingOn_26();
  }

  private native void CroppingOff_27();
  public void CroppingOff()
  {
    CroppingOff_27();
  }

  private native int GetCropping_28();
  public int GetCropping()
  {
    return GetCropping_28();
  }

  private native void SetCroppingRegion_29(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCroppingRegion(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCroppingRegion_29(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCroppingRegion_30(double id0[]);
  public void SetCroppingRegion(double id0[])
  {
    SetCroppingRegion_30(id0);
  }

  private native double[] GetCroppingRegion_31();
  public double[] GetCroppingRegion()
  {
    return GetCroppingRegion_31();
  }

  private native void SetInterpolate_32(int id0);
  public void SetInterpolate(int id0)
  {
    SetInterpolate_32(id0);
  }

  private native void InterpolateOn_33();
  public void InterpolateOn()
  {
    InterpolateOn_33();
  }

  private native void InterpolateOff_34();
  public void InterpolateOff()
  {
    InterpolateOff_34();
  }

  private native int GetInterpolate_35();
  public int GetInterpolate()
  {
    return GetInterpolate_35();
  }

  private native void SetInterpolator_36(vtkAbstractImageInterpolator id0);
  public void SetInterpolator(vtkAbstractImageInterpolator id0)
  {
    SetInterpolator_36(id0);
  }

  private native long GetInterpolator_37();
  public vtkAbstractImageInterpolator GetInterpolator()
  {
    long temp = GetInterpolator_37();

    if (temp == 0) return null;
    return (vtkAbstractImageInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_38();
  public long GetMTime()
  {
    return GetMTime_38();
  }

  public vtkImageResize() { super(); }

  public vtkImageResize(long id) { super(id); }
  public native long   VTKInit();

}
