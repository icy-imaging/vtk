// java wrapper for vtkMassProperties object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMassProperties extends vtkPolyDataAlgorithm
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

  private native double GetVolume_4();
  public double GetVolume()
  {
    return GetVolume_4();
  }

  private native double GetVolumeProjected_5();
  public double GetVolumeProjected()
  {
    return GetVolumeProjected_5();
  }

  private native double GetVolumeX_6();
  public double GetVolumeX()
  {
    return GetVolumeX_6();
  }

  private native double GetVolumeY_7();
  public double GetVolumeY()
  {
    return GetVolumeY_7();
  }

  private native double GetVolumeZ_8();
  public double GetVolumeZ()
  {
    return GetVolumeZ_8();
  }

  private native double GetKx_9();
  public double GetKx()
  {
    return GetKx_9();
  }

  private native double GetKy_10();
  public double GetKy()
  {
    return GetKy_10();
  }

  private native double GetKz_11();
  public double GetKz()
  {
    return GetKz_11();
  }

  private native double GetSurfaceArea_12();
  public double GetSurfaceArea()
  {
    return GetSurfaceArea_12();
  }

  private native double GetMinCellArea_13();
  public double GetMinCellArea()
  {
    return GetMinCellArea_13();
  }

  private native double GetMaxCellArea_14();
  public double GetMaxCellArea()
  {
    return GetMaxCellArea_14();
  }

  private native double GetNormalizedShapeIndex_15();
  public double GetNormalizedShapeIndex()
  {
    return GetNormalizedShapeIndex_15();
  }

  public vtkMassProperties() { super(); }

  public vtkMassProperties(long id) { super(id); }
  public native long   VTKInit();

}
