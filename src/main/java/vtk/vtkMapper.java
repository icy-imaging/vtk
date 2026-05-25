// java wrapper for vtkMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMapper extends vtkAbstractMapper3D
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

  private native void ShallowCopy_4(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_4(id0);
  }

  private native long GetMTime_5();
  public long GetMTime()
  {
    return GetMTime_5();
  }

  private native void Render_6(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_6(id0,id1);
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native void SetLookupTable_8(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_8(id0);
  }

  private native long GetLookupTable_9();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_9();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_10();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_10();
  }

  private native void SetScalarVisibility_11(int id0);
  public void SetScalarVisibility(int id0)
  {
    SetScalarVisibility_11(id0);
  }

  private native int GetScalarVisibility_12();
  public int GetScalarVisibility()
  {
    return GetScalarVisibility_12();
  }

  private native void ScalarVisibilityOn_13();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_13();
  }

  private native void ScalarVisibilityOff_14();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_14();
  }

  private native void SetStatic_15(int id0);
  public void SetStatic(int id0)
  {
    SetStatic_15(id0);
  }

  private native int GetStatic_16();
  public int GetStatic()
  {
    return GetStatic_16();
  }

  private native void StaticOn_17();
  public void StaticOn()
  {
    StaticOn_17();
  }

  private native void StaticOff_18();
  public void StaticOff()
  {
    StaticOff_18();
  }

  private native void SetColorMode_19(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_19(id0);
  }

  private native int GetColorMode_20();
  public int GetColorMode()
  {
    return GetColorMode_20();
  }

  private native void SetColorModeToDefault_21();
  public void SetColorModeToDefault()
  {
    SetColorModeToDefault_21();
  }

  private native void SetColorModeToMapScalars_22();
  public void SetColorModeToMapScalars()
  {
    SetColorModeToMapScalars_22();
  }

  private native void SetColorModeToDirectScalars_23();
  public void SetColorModeToDirectScalars()
  {
    SetColorModeToDirectScalars_23();
  }

  private native byte[] GetColorModeAsString_24();
  public String GetColorModeAsString()
  {
    return new String(GetColorModeAsString_24(), StandardCharsets.UTF_8);
  }

  private native void SetInterpolateScalarsBeforeMapping_25(int id0);
  public void SetInterpolateScalarsBeforeMapping(int id0)
  {
    SetInterpolateScalarsBeforeMapping_25(id0);
  }

  private native int GetInterpolateScalarsBeforeMapping_26();
  public int GetInterpolateScalarsBeforeMapping()
  {
    return GetInterpolateScalarsBeforeMapping_26();
  }

  private native void InterpolateScalarsBeforeMappingOn_27();
  public void InterpolateScalarsBeforeMappingOn()
  {
    InterpolateScalarsBeforeMappingOn_27();
  }

  private native void InterpolateScalarsBeforeMappingOff_28();
  public void InterpolateScalarsBeforeMappingOff()
  {
    InterpolateScalarsBeforeMappingOff_28();
  }

  private native void SetUseLookupTableScalarRange_29(int id0);
  public void SetUseLookupTableScalarRange(int id0)
  {
    SetUseLookupTableScalarRange_29(id0);
  }

  private native int GetUseLookupTableScalarRange_30();
  public int GetUseLookupTableScalarRange()
  {
    return GetUseLookupTableScalarRange_30();
  }

  private native void UseLookupTableScalarRangeOn_31();
  public void UseLookupTableScalarRangeOn()
  {
    UseLookupTableScalarRangeOn_31();
  }

  private native void UseLookupTableScalarRangeOff_32();
  public void UseLookupTableScalarRangeOff()
  {
    UseLookupTableScalarRangeOff_32();
  }

  private native void SetScalarRange_33(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_33(id0,id1);
  }

  private native void SetScalarRange_34(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_34(id0);
  }

  private native double[] GetScalarRange_35();
  public double[] GetScalarRange()
  {
    return GetScalarRange_35();
  }

  private native void SetScalarMode_36(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_36(id0);
  }

  private native int GetScalarMode_37();
  public int GetScalarMode()
  {
    return GetScalarMode_37();
  }

  private native void SetScalarModeToDefault_38();
  public void SetScalarModeToDefault()
  {
    SetScalarModeToDefault_38();
  }

  private native void SetScalarModeToUsePointData_39();
  public void SetScalarModeToUsePointData()
  {
    SetScalarModeToUsePointData_39();
  }

  private native void SetScalarModeToUseCellData_40();
  public void SetScalarModeToUseCellData()
  {
    SetScalarModeToUseCellData_40();
  }

  private native void SetScalarModeToUsePointFieldData_41();
  public void SetScalarModeToUsePointFieldData()
  {
    SetScalarModeToUsePointFieldData_41();
  }

  private native void SetScalarModeToUseCellFieldData_42();
  public void SetScalarModeToUseCellFieldData()
  {
    SetScalarModeToUseCellFieldData_42();
  }

  private native void SetScalarModeToUseFieldData_43();
  public void SetScalarModeToUseFieldData()
  {
    SetScalarModeToUseFieldData_43();
  }

  private native void SelectColorArray_44(int id0);
  public void SelectColorArray(int id0)
  {
    SelectColorArray_44(id0);
  }

  private native void SelectColorArray_45(byte[] id0, int len0);
  public void SelectColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectColorArray_45(bytes0, bytes0.length);
  }

  private native void SetFieldDataTupleId_46(long id0);
  public void SetFieldDataTupleId(long id0)
  {
    SetFieldDataTupleId_46(id0);
  }

  private native long GetFieldDataTupleId_47();
  public long GetFieldDataTupleId()
  {
    return GetFieldDataTupleId_47();
  }

  private native void ColorByArrayComponent_48(int id0,int id1);
  public void ColorByArrayComponent(int id0,int id1)
  {
    ColorByArrayComponent_48(id0,id1);
  }

  private native void ColorByArrayComponent_49(byte[] id0, int len0,int id1);
  public void ColorByArrayComponent(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ColorByArrayComponent_49(bytes0, bytes0.length,id1);
  }

  private native byte[] GetArrayName_50();
  public String GetArrayName()
  {
    return new String(GetArrayName_50(), StandardCharsets.UTF_8);
  }

  private native void SetArrayName_51(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_51(bytes0, bytes0.length);
  }

  private native int GetArrayId_52();
  public int GetArrayId()
  {
    return GetArrayId_52();
  }

  private native void SetArrayId_53(int id0);
  public void SetArrayId(int id0)
  {
    SetArrayId_53(id0);
  }

  private native int GetArrayAccessMode_54();
  public int GetArrayAccessMode()
  {
    return GetArrayAccessMode_54();
  }

  private native void SetArrayAccessMode_55(int id0);
  public void SetArrayAccessMode(int id0)
  {
    SetArrayAccessMode_55(id0);
  }

  private native int GetArrayComponent_56();
  public int GetArrayComponent()
  {
    return GetArrayComponent_56();
  }

  private native void SetArrayComponent_57(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_57(id0);
  }

  private native byte[] GetScalarModeAsString_58();
  public String GetScalarModeAsString()
  {
    return new String(GetScalarModeAsString_58(), StandardCharsets.UTF_8);
  }

  private native void SetResolveCoincidentTopology_59(int id0);
  public void SetResolveCoincidentTopology(int id0)
  {
    SetResolveCoincidentTopology_59(id0);
  }

  private native int GetResolveCoincidentTopology_60();
  public int GetResolveCoincidentTopology()
  {
    return GetResolveCoincidentTopology_60();
  }

  private native void SetResolveCoincidentTopologyToDefault_61();
  public void SetResolveCoincidentTopologyToDefault()
  {
    SetResolveCoincidentTopologyToDefault_61();
  }

  private native void SetResolveCoincidentTopologyToOff_62();
  public void SetResolveCoincidentTopologyToOff()
  {
    SetResolveCoincidentTopologyToOff_62();
  }

  private native void SetResolveCoincidentTopologyToPolygonOffset_63();
  public void SetResolveCoincidentTopologyToPolygonOffset()
  {
    SetResolveCoincidentTopologyToPolygonOffset_63();
  }

  private native void SetResolveCoincidentTopologyToShiftZBuffer_64();
  public void SetResolveCoincidentTopologyToShiftZBuffer()
  {
    SetResolveCoincidentTopologyToShiftZBuffer_64();
  }

  private native void SetResolveCoincidentTopologyPolygonOffsetParameters_65(double id0,double id1);
  public void SetResolveCoincidentTopologyPolygonOffsetParameters(double id0,double id1)
  {
    SetResolveCoincidentTopologyPolygonOffsetParameters_65(id0,id1);
  }

  private native void SetRelativeCoincidentTopologyPolygonOffsetParameters_66(double id0,double id1);
  public void SetRelativeCoincidentTopologyPolygonOffsetParameters(double id0,double id1)
  {
    SetRelativeCoincidentTopologyPolygonOffsetParameters_66(id0,id1);
  }

  private native void SetResolveCoincidentTopologyLineOffsetParameters_67(double id0,double id1);
  public void SetResolveCoincidentTopologyLineOffsetParameters(double id0,double id1)
  {
    SetResolveCoincidentTopologyLineOffsetParameters_67(id0,id1);
  }

  private native void SetRelativeCoincidentTopologyLineOffsetParameters_68(double id0,double id1);
  public void SetRelativeCoincidentTopologyLineOffsetParameters(double id0,double id1)
  {
    SetRelativeCoincidentTopologyLineOffsetParameters_68(id0,id1);
  }

  private native void SetResolveCoincidentTopologyPointOffsetParameter_69(double id0);
  public void SetResolveCoincidentTopologyPointOffsetParameter(double id0)
  {
    SetResolveCoincidentTopologyPointOffsetParameter_69(id0);
  }

  private native void SetRelativeCoincidentTopologyPointOffsetParameter_70(double id0);
  public void SetRelativeCoincidentTopologyPointOffsetParameter(double id0)
  {
    SetRelativeCoincidentTopologyPointOffsetParameter_70(id0);
  }

  private native void SetResolveCoincidentTopologyPolygonOffsetFaces_71(int id0);
  public void SetResolveCoincidentTopologyPolygonOffsetFaces(int id0)
  {
    SetResolveCoincidentTopologyPolygonOffsetFaces_71(id0);
  }

  private native int GetResolveCoincidentTopologyPolygonOffsetFaces_72();
  public int GetResolveCoincidentTopologyPolygonOffsetFaces()
  {
    return GetResolveCoincidentTopologyPolygonOffsetFaces_72();
  }

  private native void SetResolveCoincidentTopologyZShift_73(double id0);
  public void SetResolveCoincidentTopologyZShift(double id0)
  {
    SetResolveCoincidentTopologyZShift_73(id0);
  }

  private native double GetResolveCoincidentTopologyZShift_74();
  public double GetResolveCoincidentTopologyZShift()
  {
    return GetResolveCoincidentTopologyZShift_74();
  }

  private native double[] GetBounds_75();
  public double[] GetBounds()
  {
    return GetBounds_75();
  }

  private native void GetBounds_76(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_76(id0);
  }

  private native void SetRenderTime_77(double id0);
  public void SetRenderTime(double id0)
  {
    SetRenderTime_77(id0);
  }

  private native double GetRenderTime_78();
  public double GetRenderTime()
  {
    return GetRenderTime_78();
  }

  private native long GetInputAsDataSet_79();
  public vtkDataSet GetInputAsDataSet()
  {
    long temp = GetInputAsDataSet_79();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MapScalars_80(double id0);
  public vtkUnsignedCharArray MapScalars(double id0)
  {
    long temp = MapScalars_80(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MapScalars_81(vtkDataSet id0,double id1);
  public vtkUnsignedCharArray MapScalars(vtkDataSet id0,double id1)
  {
    long temp = MapScalars_81(id0,id1);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasOpaqueGeometry_82();
  public boolean HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_82();
  }

  private native boolean HasTranslucentPolygonalGeometry_83();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_83();
  }

  private native boolean GetSupportsSelection_84();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_84();
  }

  private native int CanUseTextureMapForColoring_85(vtkDataObject id0);
  public int CanUseTextureMapForColoring(vtkDataObject id0)
  {
    return CanUseTextureMapForColoring_85(id0);
  }

  private native void ClearColorArrays_86();
  public void ClearColorArrays()
  {
    ClearColorArrays_86();
  }

  private native long GetColorMapColors_87();
  public vtkUnsignedCharArray GetColorMapColors()
  {
    long temp = GetColorMapColors_87();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorCoordinates_88();
  public vtkFloatArray GetColorCoordinates()
  {
    long temp = GetColorCoordinates_88();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorTextureMap_89();
  public vtkImageData GetColorTextureMap()
  {
    long temp = GetColorTextureMap_89();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelection_90();
  public vtkSelection GetSelection()
  {
    long temp = GetSelection_90();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelection_91(vtkSelection id0);
  public void SetSelection(vtkSelection id0)
  {
    SetSelection_91(id0);
  }

  public vtkMapper() { super(); }

  public vtkMapper(long id) { super(id); }

}
