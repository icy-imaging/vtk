// java wrapper for vtkGlyph3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGlyph3D extends vtkPolyDataAlgorithm
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

  private native void SetSourceConnection_6(int id0,vtkAlgorithmOutput id1);
  public void SetSourceConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetSourceConnection_6(id0,id1);
  }

  private native void SetSourceConnection_7(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_7(id0);
  }

  private native long GetSource_8(int id0);
  public vtkPolyData GetSource(int id0)
  {
    long temp = GetSource_8(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaling_9(int id0);
  public void SetScaling(int id0)
  {
    SetScaling_9(id0);
  }

  private native void ScalingOn_10();
  public void ScalingOn()
  {
    ScalingOn_10();
  }

  private native void ScalingOff_11();
  public void ScalingOff()
  {
    ScalingOff_11();
  }

  private native int GetScaling_12();
  public int GetScaling()
  {
    return GetScaling_12();
  }

  private native void SetScaleMode_13(int id0);
  public void SetScaleMode(int id0)
  {
    SetScaleMode_13(id0);
  }

  private native int GetScaleMode_14();
  public int GetScaleMode()
  {
    return GetScaleMode_14();
  }

  private native void SetScaleModeToScaleByScalar_15();
  public void SetScaleModeToScaleByScalar()
  {
    SetScaleModeToScaleByScalar_15();
  }

  private native void SetScaleModeToScaleByVector_16();
  public void SetScaleModeToScaleByVector()
  {
    SetScaleModeToScaleByVector_16();
  }

  private native void SetScaleModeToScaleByVectorComponents_17();
  public void SetScaleModeToScaleByVectorComponents()
  {
    SetScaleModeToScaleByVectorComponents_17();
  }

  private native void SetScaleModeToDataScalingOff_18();
  public void SetScaleModeToDataScalingOff()
  {
    SetScaleModeToDataScalingOff_18();
  }

  private native byte[] GetScaleModeAsString_19();
  public String GetScaleModeAsString()
  {
    return new String(GetScaleModeAsString_19(), StandardCharsets.UTF_8);
  }

  private native void SetColorMode_20(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_20(id0);
  }

  private native int GetColorMode_21();
  public int GetColorMode()
  {
    return GetColorMode_21();
  }

  private native void SetColorModeToColorByScale_22();
  public void SetColorModeToColorByScale()
  {
    SetColorModeToColorByScale_22();
  }

  private native void SetColorModeToColorByScalar_23();
  public void SetColorModeToColorByScalar()
  {
    SetColorModeToColorByScalar_23();
  }

  private native void SetColorModeToColorByVector_24();
  public void SetColorModeToColorByVector()
  {
    SetColorModeToColorByVector_24();
  }

  private native byte[] GetColorModeAsString_25();
  public String GetColorModeAsString()
  {
    return new String(GetColorModeAsString_25(), StandardCharsets.UTF_8);
  }

  private native void SetScaleFactor_26(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_26(id0);
  }

  private native double GetScaleFactor_27();
  public double GetScaleFactor()
  {
    return GetScaleFactor_27();
  }

  private native void SetRange_28(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_28(id0,id1);
  }

  private native void SetRange_29(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_29(id0);
  }

  private native double[] GetRange_30();
  public double[] GetRange()
  {
    return GetRange_30();
  }

  private native void SetOrient_31(int id0);
  public void SetOrient(int id0)
  {
    SetOrient_31(id0);
  }

  private native void OrientOn_32();
  public void OrientOn()
  {
    OrientOn_32();
  }

  private native void OrientOff_33();
  public void OrientOff()
  {
    OrientOff_33();
  }

  private native int GetOrient_34();
  public int GetOrient()
  {
    return GetOrient_34();
  }

  private native void SetClamping_35(int id0);
  public void SetClamping(int id0)
  {
    SetClamping_35(id0);
  }

  private native void ClampingOn_36();
  public void ClampingOn()
  {
    ClampingOn_36();
  }

  private native void ClampingOff_37();
  public void ClampingOff()
  {
    ClampingOff_37();
  }

  private native int GetClamping_38();
  public int GetClamping()
  {
    return GetClamping_38();
  }

  private native void SetVectorMode_39(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_39(id0);
  }

  private native int GetVectorMode_40();
  public int GetVectorMode()
  {
    return GetVectorMode_40();
  }

  private native void SetVectorModeToUseVector_41();
  public void SetVectorModeToUseVector()
  {
    SetVectorModeToUseVector_41();
  }

  private native void SetVectorModeToUseNormal_42();
  public void SetVectorModeToUseNormal()
  {
    SetVectorModeToUseNormal_42();
  }

  private native void SetVectorModeToVectorRotationOff_43();
  public void SetVectorModeToVectorRotationOff()
  {
    SetVectorModeToVectorRotationOff_43();
  }

  private native void SetVectorModeToFollowCameraDirection_44();
  public void SetVectorModeToFollowCameraDirection()
  {
    SetVectorModeToFollowCameraDirection_44();
  }

  private native byte[] GetVectorModeAsString_45();
  public String GetVectorModeAsString()
  {
    return new String(GetVectorModeAsString_45(), StandardCharsets.UTF_8);
  }

  private native double[] GetFollowedCameraPosition_46();
  public double[] GetFollowedCameraPosition()
  {
    return GetFollowedCameraPosition_46();
  }

  private native double[] GetFollowedCameraViewUp_47();
  public double[] GetFollowedCameraViewUp()
  {
    return GetFollowedCameraViewUp_47();
  }

  private native void SetIndexMode_48(int id0);
  public void SetIndexMode(int id0)
  {
    SetIndexMode_48(id0);
  }

  private native int GetIndexMode_49();
  public int GetIndexMode()
  {
    return GetIndexMode_49();
  }

  private native void SetIndexModeToScalar_50();
  public void SetIndexModeToScalar()
  {
    SetIndexModeToScalar_50();
  }

  private native void SetIndexModeToVector_51();
  public void SetIndexModeToVector()
  {
    SetIndexModeToVector_51();
  }

  private native void SetIndexModeToOff_52();
  public void SetIndexModeToOff()
  {
    SetIndexModeToOff_52();
  }

  private native byte[] GetIndexModeAsString_53();
  public String GetIndexModeAsString()
  {
    return new String(GetIndexModeAsString_53(), StandardCharsets.UTF_8);
  }

  private native void SetGeneratePointIds_54(int id0);
  public void SetGeneratePointIds(int id0)
  {
    SetGeneratePointIds_54(id0);
  }

  private native int GetGeneratePointIds_55();
  public int GetGeneratePointIds()
  {
    return GetGeneratePointIds_55();
  }

  private native void GeneratePointIdsOn_56();
  public void GeneratePointIdsOn()
  {
    GeneratePointIdsOn_56();
  }

  private native void GeneratePointIdsOff_57();
  public void GeneratePointIdsOff()
  {
    GeneratePointIdsOff_57();
  }

  private native void SetPointIdsName_58(byte[] id0, int len0);
  public void SetPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdsName_58(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdsName_59();
  public String GetPointIdsName()
  {
    return new String(GetPointIdsName_59(), StandardCharsets.UTF_8);
  }

  private native void SetFillCellData_60(int id0);
  public void SetFillCellData(int id0)
  {
    SetFillCellData_60(id0);
  }

  private native int GetFillCellData_61();
  public int GetFillCellData()
  {
    return GetFillCellData_61();
  }

  private native void FillCellDataOn_62();
  public void FillCellDataOn()
  {
    FillCellDataOn_62();
  }

  private native void FillCellDataOff_63();
  public void FillCellDataOff()
  {
    FillCellDataOff_63();
  }

  private native int IsPointVisible_64(vtkDataSet id0,long id1);
  public int IsPointVisible(vtkDataSet id0,long id1)
  {
    return IsPointVisible_64(id0,id1);
  }

  private native void SetSourceTransform_65(vtkTransform id0);
  public void SetSourceTransform(vtkTransform id0)
  {
    SetSourceTransform_65(id0);
  }

  private native long GetSourceTransform_66();
  public vtkTransform GetSourceTransform()
  {
    long temp = GetSourceTransform_66();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_67();
  public long GetMTime()
  {
    return GetMTime_67();
  }

  private native void SetOutputPointsPrecision_68(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_68(id0);
  }

  private native int GetOutputPointsPrecision_69();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_69();
  }

  public vtkGlyph3D() { super(); }

  public vtkGlyph3D(long id) { super(id); }
  public native long   VTKInit();

}
