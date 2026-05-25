// java wrapper for vtkLabeledTreeMapDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabeledTreeMapDataMapper extends vtkLabeledDataMapper
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

  private native void RenderOpaqueGeometry_4(vtkViewport id0,vtkActor2D id1);
  public void RenderOpaqueGeometry(vtkViewport id0,vtkActor2D id1)
  {
    RenderOpaqueGeometry_4(id0,id1);
  }

  private native void RenderOverlay_5(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_5(id0,id1);
  }

  private native long GetInputTree_6();
  public vtkTree GetInputTree()
  {
    long temp = GetInputTree_6();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRectanglesArrayName_7(byte[] id0, int len0);
  public void SetRectanglesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRectanglesArrayName_7(bytes0, bytes0.length);
  }

  private native int GetClipTextMode_8();
  public int GetClipTextMode()
  {
    return GetClipTextMode_8();
  }

  private native void SetClipTextMode_9(int id0);
  public void SetClipTextMode(int id0)
  {
    SetClipTextMode_9(id0);
  }

  private native int GetChildMotion_10();
  public int GetChildMotion()
  {
    return GetChildMotion_10();
  }

  private native void SetChildMotion_11(int id0);
  public void SetChildMotion(int id0)
  {
    SetChildMotion_11(id0);
  }

  private native int GetDynamicLevel_12();
  public int GetDynamicLevel()
  {
    return GetDynamicLevel_12();
  }

  private native void SetDynamicLevel_13(int id0);
  public void SetDynamicLevel(int id0)
  {
    SetDynamicLevel_13(id0);
  }

  private native void ReleaseGraphicsResources_14(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_14(id0);
  }

  private native void SetFontSizeRange_15(int id0,int id1,int id2);
  public void SetFontSizeRange(int id0,int id1,int id2)
  {
    SetFontSizeRange_15(id0,id1,id2);
  }

  private native void GetFontSizeRange_16(int id0[]);
  public void GetFontSizeRange(int id0[])
  {
    GetFontSizeRange_16(id0);
  }

  private native void SetLevelRange_17(int id0,int id1);
  public void SetLevelRange(int id0,int id1)
  {
    SetLevelRange_17(id0,id1);
  }

  private native void GetLevelRange_18(int id0[]);
  public void GetLevelRange(int id0[])
  {
    GetLevelRange_18(id0);
  }

  public vtkLabeledTreeMapDataMapper() { super(); }

  public vtkLabeledTreeMapDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
