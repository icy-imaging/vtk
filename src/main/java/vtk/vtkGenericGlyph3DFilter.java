// java wrapper for vtkGenericGlyph3DFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericGlyph3DFilter extends vtkPolyDataAlgorithm
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

  private native void SetSourceData_4(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_4(id0);
  }

  private native void SetSourceData_5(int id0,vtkPolyData id1);
  public void SetSourceData(int id0,vtkPolyData id1)
  {
    SetSourceData_5(id0,id1);
  }

  private native long GetSource_6(int id0);
  public vtkPolyData GetSource(int id0)
  {
    long temp = GetSource_6(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaling_7(int id0);
  public void SetScaling(int id0)
  {
    SetScaling_7(id0);
  }

  private native void ScalingOn_8();
  public void ScalingOn()
  {
    ScalingOn_8();
  }

  private native void ScalingOff_9();
  public void ScalingOff()
  {
    ScalingOff_9();
  }

  private native int GetScaling_10();
  public int GetScaling()
  {
    return GetScaling_10();
  }

  private native void SetScaleMode_11(int id0);
  public void SetScaleMode(int id0)
  {
    SetScaleMode_11(id0);
  }

  private native int GetScaleMode_12();
  public int GetScaleMode()
  {
    return GetScaleMode_12();
  }

  private native void SetScaleModeToScaleByScalar_13();
  public void SetScaleModeToScaleByScalar()
  {
    SetScaleModeToScaleByScalar_13();
  }

  private native void SetScaleModeToScaleByVector_14();
  public void SetScaleModeToScaleByVector()
  {
    SetScaleModeToScaleByVector_14();
  }

  private native void SetScaleModeToScaleByVectorComponents_15();
  public void SetScaleModeToScaleByVectorComponents()
  {
    SetScaleModeToScaleByVectorComponents_15();
  }

  private native void SetScaleModeToDataScalingOff_16();
  public void SetScaleModeToDataScalingOff()
  {
    SetScaleModeToDataScalingOff_16();
  }

  private native byte[] GetScaleModeAsString_17();
  public String GetScaleModeAsString()
  {
    return new String(GetScaleModeAsString_17(), StandardCharsets.UTF_8);
  }

  private native void SetColorMode_18(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_18(id0);
  }

  private native int GetColorMode_19();
  public int GetColorMode()
  {
    return GetColorMode_19();
  }

  private native void SetColorModeToColorByScale_20();
  public void SetColorModeToColorByScale()
  {
    SetColorModeToColorByScale_20();
  }

  private native void SetColorModeToColorByScalar_21();
  public void SetColorModeToColorByScalar()
  {
    SetColorModeToColorByScalar_21();
  }

  private native void SetColorModeToColorByVector_22();
  public void SetColorModeToColorByVector()
  {
    SetColorModeToColorByVector_22();
  }

  private native byte[] GetColorModeAsString_23();
  public String GetColorModeAsString()
  {
    return new String(GetColorModeAsString_23(), StandardCharsets.UTF_8);
  }

  private native void SetScaleFactor_24(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_24(id0);
  }

  private native double GetScaleFactor_25();
  public double GetScaleFactor()
  {
    return GetScaleFactor_25();
  }

  private native void SetRange_26(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_26(id0,id1);
  }

  private native void SetRange_27(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_27(id0);
  }

  private native double[] GetRange_28();
  public double[] GetRange()
  {
    return GetRange_28();
  }

  private native void SetOrient_29(int id0);
  public void SetOrient(int id0)
  {
    SetOrient_29(id0);
  }

  private native void OrientOn_30();
  public void OrientOn()
  {
    OrientOn_30();
  }

  private native void OrientOff_31();
  public void OrientOff()
  {
    OrientOff_31();
  }

  private native int GetOrient_32();
  public int GetOrient()
  {
    return GetOrient_32();
  }

  private native void SetClamping_33(int id0);
  public void SetClamping(int id0)
  {
    SetClamping_33(id0);
  }

  private native void ClampingOn_34();
  public void ClampingOn()
  {
    ClampingOn_34();
  }

  private native void ClampingOff_35();
  public void ClampingOff()
  {
    ClampingOff_35();
  }

  private native int GetClamping_36();
  public int GetClamping()
  {
    return GetClamping_36();
  }

  private native void SetVectorMode_37(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_37(id0);
  }

  private native int GetVectorMode_38();
  public int GetVectorMode()
  {
    return GetVectorMode_38();
  }

  private native void SetVectorModeToUseVector_39();
  public void SetVectorModeToUseVector()
  {
    SetVectorModeToUseVector_39();
  }

  private native void SetVectorModeToUseNormal_40();
  public void SetVectorModeToUseNormal()
  {
    SetVectorModeToUseNormal_40();
  }

  private native void SetVectorModeToVectorRotationOff_41();
  public void SetVectorModeToVectorRotationOff()
  {
    SetVectorModeToVectorRotationOff_41();
  }

  private native byte[] GetVectorModeAsString_42();
  public String GetVectorModeAsString()
  {
    return new String(GetVectorModeAsString_42(), StandardCharsets.UTF_8);
  }

  private native void SetIndexMode_43(int id0);
  public void SetIndexMode(int id0)
  {
    SetIndexMode_43(id0);
  }

  private native int GetIndexMode_44();
  public int GetIndexMode()
  {
    return GetIndexMode_44();
  }

  private native void SetIndexModeToScalar_45();
  public void SetIndexModeToScalar()
  {
    SetIndexModeToScalar_45();
  }

  private native void SetIndexModeToVector_46();
  public void SetIndexModeToVector()
  {
    SetIndexModeToVector_46();
  }

  private native void SetIndexModeToOff_47();
  public void SetIndexModeToOff()
  {
    SetIndexModeToOff_47();
  }

  private native byte[] GetIndexModeAsString_48();
  public String GetIndexModeAsString()
  {
    return new String(GetIndexModeAsString_48(), StandardCharsets.UTF_8);
  }

  private native void SetGeneratePointIds_49(int id0);
  public void SetGeneratePointIds(int id0)
  {
    SetGeneratePointIds_49(id0);
  }

  private native int GetGeneratePointIds_50();
  public int GetGeneratePointIds()
  {
    return GetGeneratePointIds_50();
  }

  private native void GeneratePointIdsOn_51();
  public void GeneratePointIdsOn()
  {
    GeneratePointIdsOn_51();
  }

  private native void GeneratePointIdsOff_52();
  public void GeneratePointIdsOff()
  {
    GeneratePointIdsOff_52();
  }

  private native void SetPointIdsName_53(byte[] id0, int len0);
  public void SetPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdsName_53(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdsName_54();
  public String GetPointIdsName()
  {
    return new String(GetPointIdsName_54(), StandardCharsets.UTF_8);
  }

  private native byte[] GetInputScalarsSelection_55();
  public String GetInputScalarsSelection()
  {
    return new String(GetInputScalarsSelection_55(), StandardCharsets.UTF_8);
  }

  private native void SelectInputScalars_56(byte[] id0, int len0);
  public void SelectInputScalars(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectInputScalars_56(bytes0, bytes0.length);
  }

  private native byte[] GetInputVectorsSelection_57();
  public String GetInputVectorsSelection()
  {
    return new String(GetInputVectorsSelection_57(), StandardCharsets.UTF_8);
  }

  private native void SelectInputVectors_58(byte[] id0, int len0);
  public void SelectInputVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectInputVectors_58(bytes0, bytes0.length);
  }

  private native byte[] GetInputNormalsSelection_59();
  public String GetInputNormalsSelection()
  {
    return new String(GetInputNormalsSelection_59(), StandardCharsets.UTF_8);
  }

  private native void SelectInputNormals_60(byte[] id0, int len0);
  public void SelectInputNormals(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectInputNormals_60(bytes0, bytes0.length);
  }

  public vtkGenericGlyph3DFilter() { super(); }

  public vtkGenericGlyph3DFilter(long id) { super(id); }
  public native long   VTKInit();

}
