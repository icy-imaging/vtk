// java wrapper for vtkCompositeCellGridMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeCellGridMapper extends vtkMapper
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

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native boolean HasOpaqueGeometry_8();
  public boolean HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_8();
  }

  private native boolean HasTranslucentPolygonalGeometry_9();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_9();
  }

  private native void SetProcessIdArrayName_10(byte[] id0, int len0);
  public void SetProcessIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetProcessIdArrayName_10(bytes0, bytes0.length);
  }

  private native void SetCompositeIdArrayName_11(byte[] id0, int len0);
  public void SetCompositeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCompositeIdArrayName_11(bytes0, bytes0.length);
  }

  private native void SetPointIdArrayName_12(byte[] id0, int len0);
  public void SetPointIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdArrayName_12(bytes0, bytes0.length);
  }

  private native void SetCellIdArrayName_13(byte[] id0, int len0);
  public void SetCellIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellIdArrayName_13(bytes0, bytes0.length);
  }

  private native long GetCompositeDataDisplayAttributes_14();
  public vtkCompositeDataDisplayAttributes GetCompositeDataDisplayAttributes()
  {
    long temp = GetCompositeDataDisplayAttributes_14();

    if (temp == 0) return null;
    return (vtkCompositeDataDisplayAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCompositeDataDisplayAttributes_15(vtkCompositeDataDisplayAttributes id0);
  public void SetCompositeDataDisplayAttributes(vtkCompositeDataDisplayAttributes id0)
  {
    SetCompositeDataDisplayAttributes_15(id0);
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  public vtkCompositeCellGridMapper() { super(); }

  public vtkCompositeCellGridMapper(long id) { super(id); }
  public native long   VTKInit();

}
