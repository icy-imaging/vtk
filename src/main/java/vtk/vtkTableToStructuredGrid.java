// java wrapper for vtkTableToStructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableToStructuredGrid extends vtkStructuredGridAlgorithm
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

  private native void SetWholeExtent_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_5(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_5(id0);
  }

  private native int[] GetWholeExtent_6();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_6();
  }

  private native void SetXColumn_7(byte[] id0, int len0);
  public void SetXColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXColumn_7(bytes0, bytes0.length);
  }

  private native byte[] GetXColumn_8();
  public String GetXColumn()
  {
    return new String(GetXColumn_8(), StandardCharsets.UTF_8);
  }

  private native void SetXComponent_9(int id0);
  public void SetXComponent(int id0)
  {
    SetXComponent_9(id0);
  }

  private native int GetXComponentMinValue_10();
  public int GetXComponentMinValue()
  {
    return GetXComponentMinValue_10();
  }

  private native int GetXComponentMaxValue_11();
  public int GetXComponentMaxValue()
  {
    return GetXComponentMaxValue_11();
  }

  private native int GetXComponent_12();
  public int GetXComponent()
  {
    return GetXComponent_12();
  }

  private native void SetYColumn_13(byte[] id0, int len0);
  public void SetYColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYColumn_13(bytes0, bytes0.length);
  }

  private native byte[] GetYColumn_14();
  public String GetYColumn()
  {
    return new String(GetYColumn_14(), StandardCharsets.UTF_8);
  }

  private native void SetYComponent_15(int id0);
  public void SetYComponent(int id0)
  {
    SetYComponent_15(id0);
  }

  private native int GetYComponentMinValue_16();
  public int GetYComponentMinValue()
  {
    return GetYComponentMinValue_16();
  }

  private native int GetYComponentMaxValue_17();
  public int GetYComponentMaxValue()
  {
    return GetYComponentMaxValue_17();
  }

  private native int GetYComponent_18();
  public int GetYComponent()
  {
    return GetYComponent_18();
  }

  private native void SetZColumn_19(byte[] id0, int len0);
  public void SetZColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZColumn_19(bytes0, bytes0.length);
  }

  private native byte[] GetZColumn_20();
  public String GetZColumn()
  {
    return new String(GetZColumn_20(), StandardCharsets.UTF_8);
  }

  private native void SetZComponent_21(int id0);
  public void SetZComponent(int id0)
  {
    SetZComponent_21(id0);
  }

  private native int GetZComponentMinValue_22();
  public int GetZComponentMinValue()
  {
    return GetZComponentMinValue_22();
  }

  private native int GetZComponentMaxValue_23();
  public int GetZComponentMaxValue()
  {
    return GetZComponentMaxValue_23();
  }

  private native int GetZComponent_24();
  public int GetZComponent()
  {
    return GetZComponent_24();
  }

  public vtkTableToStructuredGrid() { super(); }

  public vtkTableToStructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
