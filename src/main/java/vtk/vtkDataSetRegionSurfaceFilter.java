// java wrapper for vtkDataSetRegionSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetRegionSurfaceFilter extends vtkDataSetSurfaceFilter
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

  private native void SetRegionArrayName_4(byte[] id0, int len0);
  public void SetRegionArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRegionArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetRegionArrayName_5();
  public String GetRegionArrayName()
  {
    return new String(GetRegionArrayName_5(), StandardCharsets.UTF_8);
  }

  private native int UnstructuredGridExecute_6(vtkDataSet id0,vtkPolyData id1);
  public int UnstructuredGridExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return UnstructuredGridExecute_6(id0,id1);
  }

  private native void SetSingleSided_7(boolean id0);
  public void SetSingleSided(boolean id0)
  {
    SetSingleSided_7(id0);
  }

  private native boolean GetSingleSided_8();
  public boolean GetSingleSided()
  {
    return GetSingleSided_8();
  }

  private native void SetMaterialPropertiesName_9(byte[] id0, int len0);
  public void SetMaterialPropertiesName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialPropertiesName_9(bytes0, bytes0.length);
  }

  private native byte[] GetMaterialPropertiesName_10();
  public String GetMaterialPropertiesName()
  {
    return new String(GetMaterialPropertiesName_10(), StandardCharsets.UTF_8);
  }

  private native void SetMaterialIDsName_11(byte[] id0, int len0);
  public void SetMaterialIDsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialIDsName_11(bytes0, bytes0.length);
  }

  private native byte[] GetMaterialIDsName_12();
  public String GetMaterialIDsName()
  {
    return new String(GetMaterialIDsName_12(), StandardCharsets.UTF_8);
  }

  private native void SetMaterialPIDsName_13(byte[] id0, int len0);
  public void SetMaterialPIDsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialPIDsName_13(bytes0, bytes0.length);
  }

  private native byte[] GetMaterialPIDsName_14();
  public String GetMaterialPIDsName()
  {
    return new String(GetMaterialPIDsName_14(), StandardCharsets.UTF_8);
  }

  private native void SetInterfaceIDsName_15(byte[] id0, int len0);
  public void SetInterfaceIDsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInterfaceIDsName_15(bytes0, bytes0.length);
  }

  private native byte[] GetInterfaceIDsName_16();
  public String GetInterfaceIDsName()
  {
    return new String(GetInterfaceIDsName_16(), StandardCharsets.UTF_8);
  }

  public vtkDataSetRegionSurfaceFilter() { super(); }

  public vtkDataSetRegionSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
