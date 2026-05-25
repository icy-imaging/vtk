// java wrapper for vtkParametricFunctionSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricFunctionSource extends vtkPolyDataAlgorithm
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

  private native void SetParametricFunction_4(vtkParametricFunction id0);
  public void SetParametricFunction(vtkParametricFunction id0)
  {
    SetParametricFunction_4(id0);
  }

  private native long GetParametricFunction_5();
  public vtkParametricFunction GetParametricFunction()
  {
    long temp = GetParametricFunction_5();

    if (temp == 0) return null;
    return (vtkParametricFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUResolution_6(int id0);
  public void SetUResolution(int id0)
  {
    SetUResolution_6(id0);
  }

  private native int GetUResolutionMinValue_7();
  public int GetUResolutionMinValue()
  {
    return GetUResolutionMinValue_7();
  }

  private native int GetUResolutionMaxValue_8();
  public int GetUResolutionMaxValue()
  {
    return GetUResolutionMaxValue_8();
  }

  private native int GetUResolution_9();
  public int GetUResolution()
  {
    return GetUResolution_9();
  }

  private native void SetVResolution_10(int id0);
  public void SetVResolution(int id0)
  {
    SetVResolution_10(id0);
  }

  private native int GetVResolutionMinValue_11();
  public int GetVResolutionMinValue()
  {
    return GetVResolutionMinValue_11();
  }

  private native int GetVResolutionMaxValue_12();
  public int GetVResolutionMaxValue()
  {
    return GetVResolutionMaxValue_12();
  }

  private native int GetVResolution_13();
  public int GetVResolution()
  {
    return GetVResolution_13();
  }

  private native void SetWResolution_14(int id0);
  public void SetWResolution(int id0)
  {
    SetWResolution_14(id0);
  }

  private native int GetWResolutionMinValue_15();
  public int GetWResolutionMinValue()
  {
    return GetWResolutionMinValue_15();
  }

  private native int GetWResolutionMaxValue_16();
  public int GetWResolutionMaxValue()
  {
    return GetWResolutionMaxValue_16();
  }

  private native int GetWResolution_17();
  public int GetWResolution()
  {
    return GetWResolution_17();
  }

  private native void GenerateTextureCoordinatesOn_18();
  public void GenerateTextureCoordinatesOn()
  {
    GenerateTextureCoordinatesOn_18();
  }

  private native void GenerateTextureCoordinatesOff_19();
  public void GenerateTextureCoordinatesOff()
  {
    GenerateTextureCoordinatesOff_19();
  }

  private native void SetGenerateTextureCoordinates_20(int id0);
  public void SetGenerateTextureCoordinates(int id0)
  {
    SetGenerateTextureCoordinates_20(id0);
  }

  private native int GetGenerateTextureCoordinatesMinValue_21();
  public int GetGenerateTextureCoordinatesMinValue()
  {
    return GetGenerateTextureCoordinatesMinValue_21();
  }

  private native int GetGenerateTextureCoordinatesMaxValue_22();
  public int GetGenerateTextureCoordinatesMaxValue()
  {
    return GetGenerateTextureCoordinatesMaxValue_22();
  }

  private native int GetGenerateTextureCoordinates_23();
  public int GetGenerateTextureCoordinates()
  {
    return GetGenerateTextureCoordinates_23();
  }

  private native void GenerateNormalsOn_24();
  public void GenerateNormalsOn()
  {
    GenerateNormalsOn_24();
  }

  private native void GenerateNormalsOff_25();
  public void GenerateNormalsOff()
  {
    GenerateNormalsOff_25();
  }

  private native void SetGenerateNormals_26(int id0);
  public void SetGenerateNormals(int id0)
  {
    SetGenerateNormals_26(id0);
  }

  private native int GetGenerateNormalsMinValue_27();
  public int GetGenerateNormalsMinValue()
  {
    return GetGenerateNormalsMinValue_27();
  }

  private native int GetGenerateNormalsMaxValue_28();
  public int GetGenerateNormalsMaxValue()
  {
    return GetGenerateNormalsMaxValue_28();
  }

  private native int GetGenerateNormals_29();
  public int GetGenerateNormals()
  {
    return GetGenerateNormals_29();
  }

  private native void SetScalarMode_30(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_30(id0);
  }

  private native int GetScalarModeMinValue_31();
  public int GetScalarModeMinValue()
  {
    return GetScalarModeMinValue_31();
  }

  private native int GetScalarModeMaxValue_32();
  public int GetScalarModeMaxValue()
  {
    return GetScalarModeMaxValue_32();
  }

  private native int GetScalarMode_33();
  public int GetScalarMode()
  {
    return GetScalarMode_33();
  }

  private native void SetScalarModeToNone_34();
  public void SetScalarModeToNone()
  {
    SetScalarModeToNone_34();
  }

  private native void SetScalarModeToU_35();
  public void SetScalarModeToU()
  {
    SetScalarModeToU_35();
  }

  private native void SetScalarModeToV_36();
  public void SetScalarModeToV()
  {
    SetScalarModeToV_36();
  }

  private native void SetScalarModeToU0_37();
  public void SetScalarModeToU0()
  {
    SetScalarModeToU0_37();
  }

  private native void SetScalarModeToV0_38();
  public void SetScalarModeToV0()
  {
    SetScalarModeToV0_38();
  }

  private native void SetScalarModeToU0V0_39();
  public void SetScalarModeToU0V0()
  {
    SetScalarModeToU0V0_39();
  }

  private native void SetScalarModeToModulus_40();
  public void SetScalarModeToModulus()
  {
    SetScalarModeToModulus_40();
  }

  private native void SetScalarModeToPhase_41();
  public void SetScalarModeToPhase()
  {
    SetScalarModeToPhase_41();
  }

  private native void SetScalarModeToQuadrant_42();
  public void SetScalarModeToQuadrant()
  {
    SetScalarModeToQuadrant_42();
  }

  private native void SetScalarModeToX_43();
  public void SetScalarModeToX()
  {
    SetScalarModeToX_43();
  }

  private native void SetScalarModeToY_44();
  public void SetScalarModeToY()
  {
    SetScalarModeToY_44();
  }

  private native void SetScalarModeToZ_45();
  public void SetScalarModeToZ()
  {
    SetScalarModeToZ_45();
  }

  private native void SetScalarModeToDistance_46();
  public void SetScalarModeToDistance()
  {
    SetScalarModeToDistance_46();
  }

  private native void SetScalarModeToFunctionDefined_47();
  public void SetScalarModeToFunctionDefined()
  {
    SetScalarModeToFunctionDefined_47();
  }

  private native long GetMTime_48();
  public long GetMTime()
  {
    return GetMTime_48();
  }

  private native void SetOutputPointsPrecision_49(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_49(id0);
  }

  private native int GetOutputPointsPrecision_50();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_50();
  }

  public vtkParametricFunctionSource() { super(); }

  public vtkParametricFunctionSource(long id) { super(id); }
  public native long   VTKInit();

}
