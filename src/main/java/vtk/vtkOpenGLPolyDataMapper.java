// java wrapper for vtkOpenGLPolyDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLPolyDataMapper extends vtkPolyDataMapper
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

  private native void RenderPiece_4(vtkRenderer id0,vtkActor id1);
  public void RenderPiece(vtkRenderer id0,vtkActor id1)
  {
    RenderPiece_4(id0,id1);
  }

  private native void RenderPieceStart_5(vtkRenderer id0,vtkActor id1);
  public void RenderPieceStart(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceStart_5(id0,id1);
  }

  private native void RenderPieceDraw_6(vtkRenderer id0,vtkActor id1);
  public void RenderPieceDraw(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceDraw_6(id0,id1);
  }

  private native void RenderPieceFinish_7(vtkRenderer id0,vtkActor id1);
  public void RenderPieceFinish(vtkRenderer id0,vtkActor id1)
  {
    RenderPieceFinish_7(id0,id1);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native int GetPopulateSelectionSettings_9();
  public int GetPopulateSelectionSettings()
  {
    return GetPopulateSelectionSettings_9();
  }

  private native void SetPopulateSelectionSettings_10(int id0);
  public void SetPopulateSelectionSettings(int id0)
  {
    SetPopulateSelectionSettings_10(id0);
  }

  private native boolean GetSupportsSelection_11();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_11();
  }

  private native void SetPointIdArrayName_12(byte[] id0, int len0);
  public void SetPointIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdArrayName_13();
  public String GetPointIdArrayName()
  {
    return new String(GetPointIdArrayName_13(), StandardCharsets.UTF_8);
  }

  private native void SetCellIdArrayName_14(byte[] id0, int len0);
  public void SetCellIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellIdArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetCellIdArrayName_15();
  public String GetCellIdArrayName()
  {
    return new String(GetCellIdArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetProcessIdArrayName_16(byte[] id0, int len0);
  public void SetProcessIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetProcessIdArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetProcessIdArrayName_17();
  public String GetProcessIdArrayName()
  {
    return new String(GetProcessIdArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetCompositeIdArrayName_18(byte[] id0, int len0);
  public void SetCompositeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCompositeIdArrayName_18(bytes0, bytes0.length);
  }

  private native byte[] GetCompositeIdArrayName_19();
  public String GetCompositeIdArrayName()
  {
    return new String(GetCompositeIdArrayName_19(), StandardCharsets.UTF_8);
  }

  private native void ShallowCopy_20(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_20(id0);
  }

  private native long GetVBOs_21();
  public vtkOpenGLVertexBufferObjectGroup GetVBOs()
  {
    long temp = GetVBOs_21();

    if (temp == 0) return null;
    return (vtkOpenGLVertexBufferObjectGroup)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVBOShiftScaleMethod_22(int id0);
  public void SetVBOShiftScaleMethod(int id0)
  {
    SetVBOShiftScaleMethod_22(id0);
  }

  private native boolean GetUseProgramPointSize_23();
  public boolean GetUseProgramPointSize()
  {
    return GetUseProgramPointSize_23();
  }

  private native void SetUseProgramPointSize_24(boolean id0);
  public void SetUseProgramPointSize(boolean id0)
  {
    SetUseProgramPointSize_24(id0);
  }

  private native void UseProgramPointSizeOn_25();
  public void UseProgramPointSizeOn()
  {
    UseProgramPointSizeOn_25();
  }

  private native void UseProgramPointSizeOff_26();
  public void UseProgramPointSizeOff()
  {
    UseProgramPointSizeOff_26();
  }

  private native void MapDataArrayToVertexAttribute_27(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToVertexAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToVertexAttribute_27(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void MapDataArrayToMultiTextureAttribute_28(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToMultiTextureAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToMultiTextureAttribute_28(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void RemoveVertexAttributeMapping_29(byte[] id0, int len0);
  public void RemoveVertexAttributeMapping(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveVertexAttributeMapping_29(bytes0, bytes0.length);
  }

  private native void RemoveAllVertexAttributeMappings_30();
  public void RemoveAllVertexAttributeMappings()
  {
    RemoveAllVertexAttributeMappings_30();
  }

  public vtkOpenGLPolyDataMapper() { super(); }

  public vtkOpenGLPolyDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
