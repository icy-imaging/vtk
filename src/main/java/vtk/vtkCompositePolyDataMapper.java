// java wrapper for vtkCompositePolyDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositePolyDataMapper extends vtkPolyDataMapper
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

  private native void Render_4(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_4(id0,id1);
  }

  private native double[] GetBounds_5();
  public double[] GetBounds()
  {
    return GetBounds_5();
  }

  private native void GetBounds_6(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_6(id0);
  }

  private native void ShallowCopy_7(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_7(id0);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native boolean HasOpaqueGeometry_9();
  public boolean HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_9();
  }

  private native boolean HasTranslucentPolygonalGeometry_10();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_10();
  }

  private native void SetCompositeDataDisplayAttributes_11(vtkCompositeDataDisplayAttributes id0);
  public void SetCompositeDataDisplayAttributes(vtkCompositeDataDisplayAttributes id0)
  {
    SetCompositeDataDisplayAttributes_11(id0);
  }

  private native long GetCompositeDataDisplayAttributes_12();
  public vtkCompositeDataDisplayAttributes GetCompositeDataDisplayAttributes()
  {
    long temp = GetCompositeDataDisplayAttributes_12();

    if (temp == 0) return null;
    return (vtkCompositeDataDisplayAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBlockVisibility_13(int id0,boolean id1);
  public void SetBlockVisibility(int id0,boolean id1)
  {
    SetBlockVisibility_13(id0,id1);
  }

  private native boolean GetBlockVisibility_14(int id0);
  public boolean GetBlockVisibility(int id0)
  {
    return GetBlockVisibility_14(id0);
  }

  private native void RemoveBlockVisibility_15(int id0);
  public void RemoveBlockVisibility(int id0)
  {
    RemoveBlockVisibility_15(id0);
  }

  private native void RemoveBlockVisibilities_16();
  public void RemoveBlockVisibilities()
  {
    RemoveBlockVisibilities_16();
  }

  private native void SetBlockColor_17(int id0,double id1[]);
  public void SetBlockColor(int id0,double id1[])
  {
    SetBlockColor_17(id0,id1);
  }

  private native void SetBlockColor_18(int id0,double id1,double id2,double id3);
  public void SetBlockColor(int id0,double id1,double id2,double id3)
  {
    SetBlockColor_18(id0,id1,id2,id3);
  }

  private native void GetBlockColor_19(int id0,double id1[]);
  public void GetBlockColor(int id0,double id1[])
  {
    GetBlockColor_19(id0,id1);
  }

  private native void RemoveBlockColor_20(int id0);
  public void RemoveBlockColor(int id0)
  {
    RemoveBlockColor_20(id0);
  }

  private native void RemoveBlockColors_21();
  public void RemoveBlockColors()
  {
    RemoveBlockColors_21();
  }

  private native void SetBlockOpacity_22(int id0,double id1);
  public void SetBlockOpacity(int id0,double id1)
  {
    SetBlockOpacity_22(id0,id1);
  }

  private native double GetBlockOpacity_23(int id0);
  public double GetBlockOpacity(int id0)
  {
    return GetBlockOpacity_23(id0);
  }

  private native void RemoveBlockOpacity_24(int id0);
  public void RemoveBlockOpacity(int id0)
  {
    RemoveBlockOpacity_24(id0);
  }

  private native void RemoveBlockOpacities_25();
  public void RemoveBlockOpacities()
  {
    RemoveBlockOpacities_25();
  }

  private native void SetBlockScalarMode_26(int id0,int id1);
  public void SetBlockScalarMode(int id0,int id1)
  {
    SetBlockScalarMode_26(id0,id1);
  }

  private native int GetBlockScalarMode_27(int id0);
  public int GetBlockScalarMode(int id0)
  {
    return GetBlockScalarMode_27(id0);
  }

  private native void RemoveBlockScalarMode_28(int id0);
  public void RemoveBlockScalarMode(int id0)
  {
    RemoveBlockScalarMode_28(id0);
  }

  private native void RemoveBlockScalarModes_29();
  public void RemoveBlockScalarModes()
  {
    RemoveBlockScalarModes_29();
  }

  private native void SetBlockArrayAccessMode_30(int id0,int id1);
  public void SetBlockArrayAccessMode(int id0,int id1)
  {
    SetBlockArrayAccessMode_30(id0,id1);
  }

  private native int GetBlockArrayAccessMode_31(int id0);
  public int GetBlockArrayAccessMode(int id0)
  {
    return GetBlockArrayAccessMode_31(id0);
  }

  private native void RemoveBlockArrayAccessMode_32(int id0);
  public void RemoveBlockArrayAccessMode(int id0)
  {
    RemoveBlockArrayAccessMode_32(id0);
  }

  private native void RemoveBlockArrayAccessModes_33();
  public void RemoveBlockArrayAccessModes()
  {
    RemoveBlockArrayAccessModes_33();
  }

  private native void SetBlockArrayComponent_34(int id0,int id1);
  public void SetBlockArrayComponent(int id0,int id1)
  {
    SetBlockArrayComponent_34(id0,id1);
  }

  private native int GetBlockArrayComponent_35(int id0);
  public int GetBlockArrayComponent(int id0)
  {
    return GetBlockArrayComponent_35(id0);
  }

  private native void RemoveBlockArrayComponent_36(int id0);
  public void RemoveBlockArrayComponent(int id0)
  {
    RemoveBlockArrayComponent_36(id0);
  }

  private native void RemoveBlockArrayComponents_37();
  public void RemoveBlockArrayComponents()
  {
    RemoveBlockArrayComponents_37();
  }

  private native void SetBlockArrayId_38(int id0,int id1);
  public void SetBlockArrayId(int id0,int id1)
  {
    SetBlockArrayId_38(id0,id1);
  }

  private native int GetBlockArrayId_39(int id0);
  public int GetBlockArrayId(int id0)
  {
    return GetBlockArrayId_39(id0);
  }

  private native void RemoveBlockArrayId_40(int id0);
  public void RemoveBlockArrayId(int id0)
  {
    RemoveBlockArrayId_40(id0);
  }

  private native void RemoveBlockArrayIds_41();
  public void RemoveBlockArrayIds()
  {
    RemoveBlockArrayIds_41();
  }

  private native void SetBlockArrayName_42(int id0,byte[] id1, int len1);
  public void SetBlockArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetBlockArrayName_42(id0,bytes1, bytes1.length);
  }

  private native byte[] GetBlockArrayName_43(int id0);
  public String GetBlockArrayName(int id0)
  {
    return new String(GetBlockArrayName_43(id0), StandardCharsets.UTF_8);
  }

  private native void RemoveBlockArrayName_44(int id0);
  public void RemoveBlockArrayName(int id0)
  {
    RemoveBlockArrayName_44(id0);
  }

  private native void RemoveBlockArrayNames_45();
  public void RemoveBlockArrayNames()
  {
    RemoveBlockArrayNames_45();
  }

  private native void SetBlockFieldDataTupleId_46(int id0,long id1);
  public void SetBlockFieldDataTupleId(int id0,long id1)
  {
    SetBlockFieldDataTupleId_46(id0,id1);
  }

  private native long GetBlockFieldDataTupleId_47(int id0);
  public long GetBlockFieldDataTupleId(int id0)
  {
    return GetBlockFieldDataTupleId_47(id0);
  }

  private native void RemoveBlockFieldDataTupleId_48(int id0);
  public void RemoveBlockFieldDataTupleId(int id0)
  {
    RemoveBlockFieldDataTupleId_48(id0);
  }

  private native void RemoveBlockFieldDataTupleIds_49();
  public void RemoveBlockFieldDataTupleIds()
  {
    RemoveBlockFieldDataTupleIds_49();
  }

  private native void SetColorMissingArraysWithNanColor_50(boolean id0);
  public void SetColorMissingArraysWithNanColor(boolean id0)
  {
    SetColorMissingArraysWithNanColor_50(id0);
  }

  private native boolean GetColorMissingArraysWithNanColor_51();
  public boolean GetColorMissingArraysWithNanColor()
  {
    return GetColorMissingArraysWithNanColor_51();
  }

  private native void ColorMissingArraysWithNanColorOn_52();
  public void ColorMissingArraysWithNanColorOn()
  {
    ColorMissingArraysWithNanColorOn_52();
  }

  private native void ColorMissingArraysWithNanColorOff_53();
  public void ColorMissingArraysWithNanColorOff()
  {
    ColorMissingArraysWithNanColorOff_53();
  }

  private native void SetInputArrayToProcess_54(int id0,int id1,int id2,int id3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_54(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native void SetInputArrayToProcess_55(int id0,int id1,int id2,int id3,int id4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,int id3,int id4)
  {
    SetInputArrayToProcess_55(id0,id1,id2,id3,id4);
  }

  private native void SetInputArrayToProcess_56(int id0,vtkInformation id1);
  public void SetInputArrayToProcess(int id0,vtkInformation id1)
  {
    SetInputArrayToProcess_56(id0,id1);
  }

  private native void SetVBOShiftScaleMethod_57(int id0);
  public void SetVBOShiftScaleMethod(int id0)
  {
    SetVBOShiftScaleMethod_57(id0);
  }

  private native void SetPauseShiftScale_58(boolean id0);
  public void SetPauseShiftScale(boolean id0)
  {
    SetPauseShiftScale_58(id0);
  }

  private native long GetMTime_59();
  public long GetMTime()
  {
    return GetMTime_59();
  }

  private native void SetPointIdArrayName_60(byte[] id0, int len0);
  public void SetPointIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdArrayName_60(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdArrayName_61();
  public String GetPointIdArrayName()
  {
    return new String(GetPointIdArrayName_61(), StandardCharsets.UTF_8);
  }

  private native void SetCellIdArrayName_62(byte[] id0, int len0);
  public void SetCellIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellIdArrayName_62(bytes0, bytes0.length);
  }

  private native byte[] GetCellIdArrayName_63();
  public String GetCellIdArrayName()
  {
    return new String(GetCellIdArrayName_63(), StandardCharsets.UTF_8);
  }

  private native void SetProcessIdArrayName_64(byte[] id0, int len0);
  public void SetProcessIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetProcessIdArrayName_64(bytes0, bytes0.length);
  }

  private native byte[] GetProcessIdArrayName_65();
  public String GetProcessIdArrayName()
  {
    return new String(GetProcessIdArrayName_65(), StandardCharsets.UTF_8);
  }

  private native void SetCompositeIdArrayName_66(byte[] id0, int len0);
  public void SetCompositeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCompositeIdArrayName_66(bytes0, bytes0.length);
  }

  private native byte[] GetCompositeIdArrayName_67();
  public String GetCompositeIdArrayName()
  {
    return new String(GetCompositeIdArrayName_67(), StandardCharsets.UTF_8);
  }

  private native void SetInputArrayToProcess_68(int id0,int id1,int id2,byte[] id3, int len3,byte[] id4, int len4);
  public void SetInputArrayToProcess(int id0,int id1,int id2,String id3,String id4)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputArrayToProcess_68(id0,id1,id2,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  public vtkCompositePolyDataMapper() { super(); }

  public vtkCompositePolyDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
