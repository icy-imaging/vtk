// java wrapper for vtkGlyph3DMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGlyph3DMapper extends vtkMapper
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

  private native void SetSourceConnection_4(int id0,vtkAlgorithmOutput id1);
  public void SetSourceConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetSourceConnection_4(id0,id1);
  }

  private native void SetSourceConnection_5(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_5(id0);
  }

  private native void SetInputData_6(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_6(id0);
  }

  private native void SetSourceData_7(int id0,vtkPolyData id1);
  public void SetSourceData(int id0,vtkPolyData id1)
  {
    SetSourceData_7(id0,id1);
  }

  private native void SetSourceTableTree_8(vtkDataObjectTree id0);
  public void SetSourceTableTree(vtkDataObjectTree id0)
  {
    SetSourceTableTree_8(id0);
  }

  private native void SetSourceData_9(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_9(id0);
  }

  private native long GetSource_10(int id0);
  public vtkPolyData GetSource(int id0)
  {
    long temp = GetSource_10(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSourceTableTree_11();
  public vtkDataObjectTree GetSourceTableTree()
  {
    long temp = GetSourceTableTree_11();

    if (temp == 0) return null;
    return (vtkDataObjectTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaling_12(boolean id0);
  public void SetScaling(boolean id0)
  {
    SetScaling_12(id0);
  }

  private native void ScalingOn_13();
  public void ScalingOn()
  {
    ScalingOn_13();
  }

  private native void ScalingOff_14();
  public void ScalingOff()
  {
    ScalingOff_14();
  }

  private native boolean GetScaling_15();
  public boolean GetScaling()
  {
    return GetScaling_15();
  }

  private native void SetScaleMode_16(int id0);
  public void SetScaleMode(int id0)
  {
    SetScaleMode_16(id0);
  }

  private native int GetScaleMode_17();
  public int GetScaleMode()
  {
    return GetScaleMode_17();
  }

  private native void SetScaleFactor_18(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_18(id0);
  }

  private native double GetScaleFactor_19();
  public double GetScaleFactor()
  {
    return GetScaleFactor_19();
  }

  private native void SetScaleModeToScaleByMagnitude_20();
  public void SetScaleModeToScaleByMagnitude()
  {
    SetScaleModeToScaleByMagnitude_20();
  }

  private native void SetScaleModeToScaleByVectorComponents_21();
  public void SetScaleModeToScaleByVectorComponents()
  {
    SetScaleModeToScaleByVectorComponents_21();
  }

  private native void SetScaleModeToNoDataScaling_22();
  public void SetScaleModeToNoDataScaling()
  {
    SetScaleModeToNoDataScaling_22();
  }

  private native byte[] GetScaleModeAsString_23();
  public String GetScaleModeAsString()
  {
    return new String(GetScaleModeAsString_23(), StandardCharsets.UTF_8);
  }

  private native void SetRange_24(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_24(id0,id1);
  }

  private native void SetRange_25(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_25(id0);
  }

  private native double[] GetRange_26();
  public double[] GetRange()
  {
    return GetRange_26();
  }

  private native void SetOrient_27(boolean id0);
  public void SetOrient(boolean id0)
  {
    SetOrient_27(id0);
  }

  private native boolean GetOrient_28();
  public boolean GetOrient()
  {
    return GetOrient_28();
  }

  private native void OrientOn_29();
  public void OrientOn()
  {
    OrientOn_29();
  }

  private native void OrientOff_30();
  public void OrientOff()
  {
    OrientOff_30();
  }

  private native void SetOrientationMode_31(int id0);
  public void SetOrientationMode(int id0)
  {
    SetOrientationMode_31(id0);
  }

  private native int GetOrientationModeMinValue_32();
  public int GetOrientationModeMinValue()
  {
    return GetOrientationModeMinValue_32();
  }

  private native int GetOrientationModeMaxValue_33();
  public int GetOrientationModeMaxValue()
  {
    return GetOrientationModeMaxValue_33();
  }

  private native int GetOrientationMode_34();
  public int GetOrientationMode()
  {
    return GetOrientationMode_34();
  }

  private native void SetOrientationModeToDirection_35();
  public void SetOrientationModeToDirection()
  {
    SetOrientationModeToDirection_35();
  }

  private native void SetOrientationModeToRotation_36();
  public void SetOrientationModeToRotation()
  {
    SetOrientationModeToRotation_36();
  }

  private native void SetOrientationModeToQuaternion_37();
  public void SetOrientationModeToQuaternion()
  {
    SetOrientationModeToQuaternion_37();
  }

  private native byte[] GetOrientationModeAsString_38();
  public String GetOrientationModeAsString()
  {
    return new String(GetOrientationModeAsString_38(), StandardCharsets.UTF_8);
  }

  private native void SetClamping_39(boolean id0);
  public void SetClamping(boolean id0)
  {
    SetClamping_39(id0);
  }

  private native boolean GetClamping_40();
  public boolean GetClamping()
  {
    return GetClamping_40();
  }

  private native void ClampingOn_41();
  public void ClampingOn()
  {
    ClampingOn_41();
  }

  private native void ClampingOff_42();
  public void ClampingOff()
  {
    ClampingOff_42();
  }

  private native void SetSourceIndexing_43(boolean id0);
  public void SetSourceIndexing(boolean id0)
  {
    SetSourceIndexing_43(id0);
  }

  private native boolean GetSourceIndexing_44();
  public boolean GetSourceIndexing()
  {
    return GetSourceIndexing_44();
  }

  private native void SourceIndexingOn_45();
  public void SourceIndexingOn()
  {
    SourceIndexingOn_45();
  }

  private native void SourceIndexingOff_46();
  public void SourceIndexingOff()
  {
    SourceIndexingOff_46();
  }

  private native void SetUseSourceTableTree_47(boolean id0);
  public void SetUseSourceTableTree(boolean id0)
  {
    SetUseSourceTableTree_47(id0);
  }

  private native boolean GetUseSourceTableTree_48();
  public boolean GetUseSourceTableTree()
  {
    return GetUseSourceTableTree_48();
  }

  private native void UseSourceTableTreeOn_49();
  public void UseSourceTableTreeOn()
  {
    UseSourceTableTreeOn_49();
  }

  private native void UseSourceTableTreeOff_50();
  public void UseSourceTableTreeOff()
  {
    UseSourceTableTreeOff_50();
  }

  private native void SetUseSelectionIds_51(boolean id0);
  public void SetUseSelectionIds(boolean id0)
  {
    SetUseSelectionIds_51(id0);
  }

  private native void UseSelectionIdsOn_52();
  public void UseSelectionIdsOn()
  {
    UseSelectionIdsOn_52();
  }

  private native void UseSelectionIdsOff_53();
  public void UseSelectionIdsOff()
  {
    UseSelectionIdsOff_53();
  }

  private native boolean GetUseSelectionIds_54();
  public boolean GetUseSelectionIds()
  {
    return GetUseSelectionIds_54();
  }

  private native void GetBounds_55(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_55(id0);
  }

  private native void Render_56(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_56(id0,id1);
  }

  private native void SetMasking_57(boolean id0);
  public void SetMasking(boolean id0)
  {
    SetMasking_57(id0);
  }

  private native boolean GetMasking_58();
  public boolean GetMasking()
  {
    return GetMasking_58();
  }

  private native void MaskingOn_59();
  public void MaskingOn()
  {
    MaskingOn_59();
  }

  private native void MaskingOff_60();
  public void MaskingOff()
  {
    MaskingOff_60();
  }

  private native void SetMaskArray_61(byte[] id0, int len0);
  public void SetMaskArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaskArray_61(bytes0, bytes0.length);
  }

  private native void SetMaskArray_62(int id0);
  public void SetMaskArray(int id0)
  {
    SetMaskArray_62(id0);
  }

  private native void SetOrientationArray_63(byte[] id0, int len0);
  public void SetOrientationArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOrientationArray_63(bytes0, bytes0.length);
  }

  private native void SetOrientationArray_64(int id0);
  public void SetOrientationArray(int id0)
  {
    SetOrientationArray_64(id0);
  }

  private native void SetScaleArray_65(byte[] id0, int len0);
  public void SetScaleArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScaleArray_65(bytes0, bytes0.length);
  }

  private native void SetScaleArray_66(int id0);
  public void SetScaleArray(int id0)
  {
    SetScaleArray_66(id0);
  }

  private native void SetSourceIndexArray_67(byte[] id0, int len0);
  public void SetSourceIndexArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSourceIndexArray_67(bytes0, bytes0.length);
  }

  private native void SetSourceIndexArray_68(int id0);
  public void SetSourceIndexArray(int id0)
  {
    SetSourceIndexArray_68(id0);
  }

  private native void SetSelectionIdArray_69(byte[] id0, int len0);
  public void SetSelectionIdArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelectionIdArray_69(bytes0, bytes0.length);
  }

  private native void SetSelectionIdArray_70(int id0);
  public void SetSelectionIdArray(int id0)
  {
    SetSelectionIdArray_70(id0);
  }

  private native void SetSelectionColorId_71(int id0);
  public void SetSelectionColorId(int id0)
  {
    SetSelectionColorId_71(id0);
  }

  private native int GetSelectionColorId_72();
  public int GetSelectionColorId()
  {
    return GetSelectionColorId_72();
  }

  private native void SetBlockAttributes_73(vtkCompositeDataDisplayAttributes id0);
  public void SetBlockAttributes(vtkCompositeDataDisplayAttributes id0)
  {
    SetBlockAttributes_73(id0);
  }

  private native long GetBlockAttributes_74();
  public vtkCompositeDataDisplayAttributes GetBlockAttributes()
  {
    long temp = GetBlockAttributes_74();

    if (temp == 0) return null;
    return (vtkCompositeDataDisplayAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCullingAndLOD_75(boolean id0);
  public void SetCullingAndLOD(boolean id0)
  {
    SetCullingAndLOD_75(id0);
  }

  private native boolean GetCullingAndLOD_76();
  public boolean GetCullingAndLOD()
  {
    return GetCullingAndLOD_76();
  }

  private native long GetMaxNumberOfLOD_77();
  public long GetMaxNumberOfLOD()
  {
    return GetMaxNumberOfLOD_77();
  }

  private native void SetNumberOfLOD_78(long id0);
  public void SetNumberOfLOD(long id0)
  {
    SetNumberOfLOD_78(id0);
  }

  private native void SetLODDistanceAndTargetReduction_79(long id0,float id1,float id2);
  public void SetLODDistanceAndTargetReduction(long id0,float id1,float id2)
  {
    SetLODDistanceAndTargetReduction_79(id0,id1,id2);
  }

  private native void SetLODColoring_80(boolean id0);
  public void SetLODColoring(boolean id0)
  {
    SetLODColoring_80(id0);
  }

  private native boolean GetLODColoring_81();
  public boolean GetLODColoring()
  {
    return GetLODColoring_81();
  }

  private native boolean GetSupportsSelection_82();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_82();
  }

  public vtkGlyph3DMapper() { super(); }

  public vtkGlyph3DMapper(long id) { super(id); }
  public native long   VTKInit();

}
