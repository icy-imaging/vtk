// java wrapper for vtkLogoRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLogoRepresentation extends vtkBorderRepresentation
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

  private native void SetImage_4(vtkImageData id0);
  public void SetImage(vtkImageData id0)
  {
    SetImage_4(id0);
  }

  private native long GetImage_5();
  public vtkImageData GetImage()
  {
    long temp = GetImage_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageProperty_6(vtkProperty2D id0);
  public void SetImageProperty(vtkProperty2D id0)
  {
    SetImageProperty_6(id0);
  }

  private native long GetImageProperty_7();
  public vtkProperty2D GetImageProperty()
  {
    long temp = GetImageProperty_7();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_8();
  public void BuildRepresentation()
  {
    BuildRepresentation_8();
  }

  private native void GetActors2D_9(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_9(id0);
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  private native int RenderOverlay_11(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_11(id0);
  }

  public vtkLogoRepresentation() { super(); }

  public vtkLogoRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
