// java wrapper for vtkPointGaussianMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointGaussianMapper extends vtkPolyDataMapper
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

  private native void SetScaleFunction_4(vtkPiecewiseFunction id0);
  public void SetScaleFunction(vtkPiecewiseFunction id0)
  {
    SetScaleFunction_4(id0);
  }

  private native long GetScaleFunction_5();
  public vtkPiecewiseFunction GetScaleFunction()
  {
    long temp = GetScaleFunction_5();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaleTableSize_6(int id0);
  public void SetScaleTableSize(int id0)
  {
    SetScaleTableSize_6(id0);
  }

  private native int GetScaleTableSize_7();
  public int GetScaleTableSize()
  {
    return GetScaleTableSize_7();
  }

  private native void SetScaleArray_8(byte[] id0, int len0);
  public void SetScaleArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScaleArray_8(bytes0, bytes0.length);
  }

  private native byte[] GetScaleArray_9();
  public String GetScaleArray()
  {
    return new String(GetScaleArray_9(), StandardCharsets.UTF_8);
  }

  private native void SetScaleArrayComponent_10(int id0);
  public void SetScaleArrayComponent(int id0)
  {
    SetScaleArrayComponent_10(id0);
  }

  private native int GetScaleArrayComponent_11();
  public int GetScaleArrayComponent()
  {
    return GetScaleArrayComponent_11();
  }

  private native void SetAnisotropic_12(boolean id0);
  public void SetAnisotropic(boolean id0)
  {
    SetAnisotropic_12(id0);
  }

  private native boolean GetAnisotropic_13();
  public boolean GetAnisotropic()
  {
    return GetAnisotropic_13();
  }

  private native void AnisotropicOn_14();
  public void AnisotropicOn()
  {
    AnisotropicOn_14();
  }

  private native void AnisotropicOff_15();
  public void AnisotropicOff()
  {
    AnisotropicOff_15();
  }

  private native void SetScaleFactor_16(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_16(id0);
  }

  private native double GetScaleFactor_17();
  public double GetScaleFactor()
  {
    return GetScaleFactor_17();
  }

  private native void SetRotationArray_18(byte[] id0, int len0);
  public void SetRotationArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRotationArray_18(bytes0, bytes0.length);
  }

  private native byte[] GetRotationArray_19();
  public String GetRotationArray()
  {
    return new String(GetRotationArray_19(), StandardCharsets.UTF_8);
  }

  private native void SetEmissive_20(int id0);
  public void SetEmissive(int id0)
  {
    SetEmissive_20(id0);
  }

  private native int GetEmissive_21();
  public int GetEmissive()
  {
    return GetEmissive_21();
  }

  private native void EmissiveOn_22();
  public void EmissiveOn()
  {
    EmissiveOn_22();
  }

  private native void EmissiveOff_23();
  public void EmissiveOff()
  {
    EmissiveOff_23();
  }

  private native void SetScalarOpacityFunction_24(vtkPiecewiseFunction id0);
  public void SetScalarOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetScalarOpacityFunction_24(id0);
  }

  private native long GetScalarOpacityFunction_25();
  public vtkPiecewiseFunction GetScalarOpacityFunction()
  {
    long temp = GetScalarOpacityFunction_25();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpacityTableSize_26(int id0);
  public void SetOpacityTableSize(int id0)
  {
    SetOpacityTableSize_26(id0);
  }

  private native int GetOpacityTableSize_27();
  public int GetOpacityTableSize()
  {
    return GetOpacityTableSize_27();
  }

  private native void SetOpacityArray_28(byte[] id0, int len0);
  public void SetOpacityArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOpacityArray_28(bytes0, bytes0.length);
  }

  private native byte[] GetOpacityArray_29();
  public String GetOpacityArray()
  {
    return new String(GetOpacityArray_29(), StandardCharsets.UTF_8);
  }

  private native void SetOpacityArrayComponent_30(int id0);
  public void SetOpacityArrayComponent(int id0)
  {
    SetOpacityArrayComponent_30(id0);
  }

  private native int GetOpacityArrayComponent_31();
  public int GetOpacityArrayComponent()
  {
    return GetOpacityArrayComponent_31();
  }

  private native void SetSplatShaderCode_32(byte[] id0, int len0);
  public void SetSplatShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSplatShaderCode_32(bytes0, bytes0.length);
  }

  private native byte[] GetSplatShaderCode_33();
  public String GetSplatShaderCode()
  {
    return new String(GetSplatShaderCode_33(), StandardCharsets.UTF_8);
  }

  private native void SetTriangleScale_34(float id0);
  public void SetTriangleScale(float id0)
  {
    SetTriangleScale_34(id0);
  }

  private native float GetTriangleScale_35();
  public float GetTriangleScale()
  {
    return GetTriangleScale_35();
  }

  private native void SetBoundScale_36(float id0);
  public void SetBoundScale(float id0)
  {
    SetBoundScale_36(id0);
  }

  private native float GetBoundScale_37();
  public float GetBoundScale()
  {
    return GetBoundScale_37();
  }

  private native void SetLowpassMatrix_38(float id0,float id1,float id2);
  public void SetLowpassMatrix(float id0,float id1,float id2)
  {
    SetLowpassMatrix_38(id0,id1,id2);
  }

  private native void SetLowpassMatrix_39(float id0[]);
  public void SetLowpassMatrix(float id0[])
  {
    SetLowpassMatrix_39(id0);
  }

  private native float[] GetLowpassMatrix_40();
  public float[] GetLowpassMatrix()
  {
    return GetLowpassMatrix_40();
  }

  private native boolean GetSupportsSelection_41();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_41();
  }

  public vtkPointGaussianMapper() { super(); }

  public vtkPointGaussianMapper(long id) { super(id); }
  public native long   VTKInit();

}
