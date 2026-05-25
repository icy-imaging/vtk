// java wrapper for vtkExtractTensorComponents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractTensorComponents extends vtkDataSetAlgorithm
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

  private native void SetPassTensorsToOutput_4(int id0);
  public void SetPassTensorsToOutput(int id0)
  {
    SetPassTensorsToOutput_4(id0);
  }

  private native int GetPassTensorsToOutput_5();
  public int GetPassTensorsToOutput()
  {
    return GetPassTensorsToOutput_5();
  }

  private native void PassTensorsToOutputOn_6();
  public void PassTensorsToOutputOn()
  {
    PassTensorsToOutputOn_6();
  }

  private native void PassTensorsToOutputOff_7();
  public void PassTensorsToOutputOff()
  {
    PassTensorsToOutputOff_7();
  }

  private native void SetExtractScalars_8(int id0);
  public void SetExtractScalars(int id0)
  {
    SetExtractScalars_8(id0);
  }

  private native int GetExtractScalars_9();
  public int GetExtractScalars()
  {
    return GetExtractScalars_9();
  }

  private native void ExtractScalarsOn_10();
  public void ExtractScalarsOn()
  {
    ExtractScalarsOn_10();
  }

  private native void ExtractScalarsOff_11();
  public void ExtractScalarsOff()
  {
    ExtractScalarsOff_11();
  }

  private native void SetScalarComponents_12(int id0,int id1);
  public void SetScalarComponents(int id0,int id1)
  {
    SetScalarComponents_12(id0,id1);
  }

  private native void SetScalarComponents_13(int id0[]);
  public void SetScalarComponents(int id0[])
  {
    SetScalarComponents_13(id0);
  }

  private native int[] GetScalarComponents_14();
  public int[] GetScalarComponents()
  {
    return GetScalarComponents_14();
  }

  private native void SetScalarMode_15(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_15(id0);
  }

  private native int GetScalarMode_16();
  public int GetScalarMode()
  {
    return GetScalarMode_16();
  }

  private native void SetScalarModeToComponent_17();
  public void SetScalarModeToComponent()
  {
    SetScalarModeToComponent_17();
  }

  private native void SetScalarModeToEffectiveStress_18();
  public void SetScalarModeToEffectiveStress()
  {
    SetScalarModeToEffectiveStress_18();
  }

  private native void SetScalarModeToDeterminant_19();
  public void SetScalarModeToDeterminant()
  {
    SetScalarModeToDeterminant_19();
  }

  private native void SetScalarModeToNonNegativeDeterminant_20();
  public void SetScalarModeToNonNegativeDeterminant()
  {
    SetScalarModeToNonNegativeDeterminant_20();
  }

  private native void SetScalarModeToTrace_21();
  public void SetScalarModeToTrace()
  {
    SetScalarModeToTrace_21();
  }

  private native void ScalarIsComponent_22();
  public void ScalarIsComponent()
  {
    ScalarIsComponent_22();
  }

  private native void ScalarIsEffectiveStress_23();
  public void ScalarIsEffectiveStress()
  {
    ScalarIsEffectiveStress_23();
  }

  private native void ScalarIsDeterminant_24();
  public void ScalarIsDeterminant()
  {
    ScalarIsDeterminant_24();
  }

  private native void ScalarIsNonNegativeDeterminant_25();
  public void ScalarIsNonNegativeDeterminant()
  {
    ScalarIsNonNegativeDeterminant_25();
  }

  private native void ScalarIsTrace_26();
  public void ScalarIsTrace()
  {
    ScalarIsTrace_26();
  }

  private native void SetExtractVectors_27(int id0);
  public void SetExtractVectors(int id0)
  {
    SetExtractVectors_27(id0);
  }

  private native int GetExtractVectors_28();
  public int GetExtractVectors()
  {
    return GetExtractVectors_28();
  }

  private native void ExtractVectorsOn_29();
  public void ExtractVectorsOn()
  {
    ExtractVectorsOn_29();
  }

  private native void ExtractVectorsOff_30();
  public void ExtractVectorsOff()
  {
    ExtractVectorsOff_30();
  }

  private native void SetVectorComponents_31(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetVectorComponents(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetVectorComponents_31(id0,id1,id2,id3,id4,id5);
  }

  private native void SetVectorComponents_32(int id0[]);
  public void SetVectorComponents(int id0[])
  {
    SetVectorComponents_32(id0);
  }

  private native int[] GetVectorComponents_33();
  public int[] GetVectorComponents()
  {
    return GetVectorComponents_33();
  }

  private native void SetExtractNormals_34(int id0);
  public void SetExtractNormals(int id0)
  {
    SetExtractNormals_34(id0);
  }

  private native int GetExtractNormals_35();
  public int GetExtractNormals()
  {
    return GetExtractNormals_35();
  }

  private native void ExtractNormalsOn_36();
  public void ExtractNormalsOn()
  {
    ExtractNormalsOn_36();
  }

  private native void ExtractNormalsOff_37();
  public void ExtractNormalsOff()
  {
    ExtractNormalsOff_37();
  }

  private native void SetNormalizeNormals_38(int id0);
  public void SetNormalizeNormals(int id0)
  {
    SetNormalizeNormals_38(id0);
  }

  private native int GetNormalizeNormals_39();
  public int GetNormalizeNormals()
  {
    return GetNormalizeNormals_39();
  }

  private native void NormalizeNormalsOn_40();
  public void NormalizeNormalsOn()
  {
    NormalizeNormalsOn_40();
  }

  private native void NormalizeNormalsOff_41();
  public void NormalizeNormalsOff()
  {
    NormalizeNormalsOff_41();
  }

  private native void SetNormalComponents_42(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetNormalComponents(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetNormalComponents_42(id0,id1,id2,id3,id4,id5);
  }

  private native void SetNormalComponents_43(int id0[]);
  public void SetNormalComponents(int id0[])
  {
    SetNormalComponents_43(id0);
  }

  private native int[] GetNormalComponents_44();
  public int[] GetNormalComponents()
  {
    return GetNormalComponents_44();
  }

  private native void SetExtractTCoords_45(int id0);
  public void SetExtractTCoords(int id0)
  {
    SetExtractTCoords_45(id0);
  }

  private native int GetExtractTCoords_46();
  public int GetExtractTCoords()
  {
    return GetExtractTCoords_46();
  }

  private native void ExtractTCoordsOn_47();
  public void ExtractTCoordsOn()
  {
    ExtractTCoordsOn_47();
  }

  private native void ExtractTCoordsOff_48();
  public void ExtractTCoordsOff()
  {
    ExtractTCoordsOff_48();
  }

  private native void SetNumberOfTCoords_49(int id0);
  public void SetNumberOfTCoords(int id0)
  {
    SetNumberOfTCoords_49(id0);
  }

  private native int GetNumberOfTCoordsMinValue_50();
  public int GetNumberOfTCoordsMinValue()
  {
    return GetNumberOfTCoordsMinValue_50();
  }

  private native int GetNumberOfTCoordsMaxValue_51();
  public int GetNumberOfTCoordsMaxValue()
  {
    return GetNumberOfTCoordsMaxValue_51();
  }

  private native int GetNumberOfTCoords_52();
  public int GetNumberOfTCoords()
  {
    return GetNumberOfTCoords_52();
  }

  private native void SetTCoordComponents_53(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetTCoordComponents(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetTCoordComponents_53(id0,id1,id2,id3,id4,id5);
  }

  private native void SetTCoordComponents_54(int id0[]);
  public void SetTCoordComponents(int id0[])
  {
    SetTCoordComponents_54(id0);
  }

  private native int[] GetTCoordComponents_55();
  public int[] GetTCoordComponents()
  {
    return GetTCoordComponents_55();
  }

  private native void SetOutputPrecision_56(int id0);
  public void SetOutputPrecision(int id0)
  {
    SetOutputPrecision_56(id0);
  }

  private native int GetOutputPrecision_57();
  public int GetOutputPrecision()
  {
    return GetOutputPrecision_57();
  }

  public vtkExtractTensorComponents() { super(); }

  public vtkExtractTensorComponents(long id) { super(id); }
  public native long   VTKInit();

}
