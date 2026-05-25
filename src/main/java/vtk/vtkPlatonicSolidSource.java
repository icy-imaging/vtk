// java wrapper for vtkPlatonicSolidSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlatonicSolidSource extends vtkPolyDataAlgorithm
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

  private native void SetSolidType_4(int id0);
  public void SetSolidType(int id0)
  {
    SetSolidType_4(id0);
  }

  private native int GetSolidTypeMinValue_5();
  public int GetSolidTypeMinValue()
  {
    return GetSolidTypeMinValue_5();
  }

  private native int GetSolidTypeMaxValue_6();
  public int GetSolidTypeMaxValue()
  {
    return GetSolidTypeMaxValue_6();
  }

  private native int GetSolidType_7();
  public int GetSolidType()
  {
    return GetSolidType_7();
  }

  private native void SetSolidTypeToTetrahedron_8();
  public void SetSolidTypeToTetrahedron()
  {
    SetSolidTypeToTetrahedron_8();
  }

  private native void SetSolidTypeToCube_9();
  public void SetSolidTypeToCube()
  {
    SetSolidTypeToCube_9();
  }

  private native void SetSolidTypeToOctahedron_10();
  public void SetSolidTypeToOctahedron()
  {
    SetSolidTypeToOctahedron_10();
  }

  private native void SetSolidTypeToIcosahedron_11();
  public void SetSolidTypeToIcosahedron()
  {
    SetSolidTypeToIcosahedron_11();
  }

  private native void SetSolidTypeToDodecahedron_12();
  public void SetSolidTypeToDodecahedron()
  {
    SetSolidTypeToDodecahedron_12();
  }

  private native void SetOutputPointsPrecision_13(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_13(id0);
  }

  private native int GetOutputPointsPrecision_14();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_14();
  }

  public vtkPlatonicSolidSource() { super(); }

  public vtkPlatonicSolidSource(long id) { super(id); }
  public native long   VTKInit();

}
