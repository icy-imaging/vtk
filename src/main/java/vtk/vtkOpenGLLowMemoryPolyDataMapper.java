// java wrapper for vtkOpenGLLowMemoryPolyDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLLowMemoryPolyDataMapper extends vtkPolyDataMapper
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

  private native void RenderPiece_5(vtkRenderer id0,vtkActor id1);
  public void RenderPiece(vtkRenderer id0,vtkActor id1)
  {
    RenderPiece_5(id0,id1);
  }

  private native void RenderPieceStart_6(vtkRenderer id0,vtkActor id1);
  public void RenderPieceStart(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceStart_6(id0,id1);
  }

  private native void RenderPieceDraw_7(vtkRenderer id0,vtkActor id1);
  public void RenderPieceDraw(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceDraw_7(id0,id1);
  }

  private native void RenderPieceFinish_8(vtkRenderer id0,vtkActor id1);
  public void RenderPieceFinish(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceFinish_8(id0,id1);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native boolean GetPopulateSelectionSettings_10();
  public boolean GetPopulateSelectionSettings()
  {
    return GetPopulateSelectionSettings_10();
  }

  private native void SetPopulateSelectionSettings_11(boolean id0);
  public void SetPopulateSelectionSettings(boolean id0)
  {
    SetPopulateSelectionSettings_11(id0);
  }

  private native void SetVBOShiftScaleMethod_12(int id0);
  public void SetVBOShiftScaleMethod(int id0)
  {
    SetVBOShiftScaleMethod_12(id0);
  }

  private native boolean GetSupportsSelection_13();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_13();
  }

  private native void SetPointIdArrayName_14(byte[] id0, int len0);
  public void SetPointIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdArrayName_15();
  public String GetPointIdArrayName()
  {
    return new String(GetPointIdArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetCellIdArrayName_16(byte[] id0, int len0);
  public void SetCellIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellIdArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetCellIdArrayName_17();
  public String GetCellIdArrayName()
  {
    return new String(GetCellIdArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetProcessIdArrayName_18(byte[] id0, int len0);
  public void SetProcessIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetProcessIdArrayName_18(bytes0, bytes0.length);
  }

  private native byte[] GetProcessIdArrayName_19();
  public String GetProcessIdArrayName()
  {
    return new String(GetProcessIdArrayName_19(), StandardCharsets.UTF_8);
  }

  private native void SetCompositeIdArrayName_20(byte[] id0, int len0);
  public void SetCompositeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCompositeIdArrayName_20(bytes0, bytes0.length);
  }

  private native byte[] GetCompositeIdArrayName_21();
  public String GetCompositeIdArrayName()
  {
    return new String(GetCompositeIdArrayName_21(), StandardCharsets.UTF_8);
  }

  private native void ResetModsToDefault_22();
  public void ResetModsToDefault()
  {
    ResetModsToDefault_22();
  }

  private native void AddMod_23(byte[] id0, int len0);
  public void AddMod(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddMod_23(bytes0, bytes0.length);
  }

  private native void RemoveMod_24(byte[] id0, int len0);
  public void RemoveMod(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveMod_24(bytes0, bytes0.length);
  }

  private native void RemoveAllMods_25();
  public void RemoveAllMods()
  {
    RemoveAllMods_25();
  }

  private native void MapDataArrayToVertexAttribute_26(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToVertexAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToVertexAttribute_26(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void MapDataArrayToMultiTextureAttribute_27(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToMultiTextureAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToMultiTextureAttribute_27(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void RemoveVertexAttributeMapping_28(byte[] id0, int len0);
  public void RemoveVertexAttributeMapping(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveVertexAttributeMapping_28(bytes0, bytes0.length);
  }

  private native void RemoveAllVertexAttributeMappings_29();
  public void RemoveAllVertexAttributeMappings()
  {
    RemoveAllVertexAttributeMappings_29();
  }

  public vtkOpenGLLowMemoryPolyDataMapper() { super(); }

  public vtkOpenGLLowMemoryPolyDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
