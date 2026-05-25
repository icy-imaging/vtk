// java wrapper for vtkBoxClipDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoxClipDataSet extends vtkUnstructuredGridAlgorithm
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

  private native void SetBoxClip_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBoxClip(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBoxClip_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGenerateClipScalars_5(int id0);
  public void SetGenerateClipScalars(int id0)
  {
    SetGenerateClipScalars_5(id0);
  }

  private native int GetGenerateClipScalars_6();
  public int GetGenerateClipScalars()
  {
    return GetGenerateClipScalars_6();
  }

  private native void GenerateClipScalarsOn_7();
  public void GenerateClipScalarsOn()
  {
    GenerateClipScalarsOn_7();
  }

  private native void GenerateClipScalarsOff_8();
  public void GenerateClipScalarsOff()
  {
    GenerateClipScalarsOff_8();
  }

  private native void SetGenerateClippedOutput_9(int id0);
  public void SetGenerateClippedOutput(int id0)
  {
    SetGenerateClippedOutput_9(id0);
  }

  private native int GetGenerateClippedOutput_10();
  public int GetGenerateClippedOutput()
  {
    return GetGenerateClippedOutput_10();
  }

  private native void GenerateClippedOutputOn_11();
  public void GenerateClippedOutputOn()
  {
    GenerateClippedOutputOn_11();
  }

  private native void GenerateClippedOutputOff_12();
  public void GenerateClippedOutputOff()
  {
    GenerateClippedOutputOff_12();
  }

  private native long GetClippedOutput_13();
  public vtkUnstructuredGrid GetClippedOutput()
  {
    long temp = GetClippedOutput_13();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfOutputs_14();
  public int GetNumberOfOutputs()
  {
    return GetNumberOfOutputs_14();
  }

  private native void SetLocator_15(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_15(id0);
  }

  private native long GetLocator_16();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_16();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_17();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  private native int GetOrientation_19();
  public int GetOrientation()
  {
    return GetOrientation_19();
  }

  private native void SetOrientation_20(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_20(id0);
  }

  private native void InterpolateEdge_21(vtkDataSetAttributes id0,long id1,long id2,long id3,double id4);
  public void InterpolateEdge(vtkDataSetAttributes id0,long id1,long id2,long id3,double id4)
  {
    InterpolateEdge_21(id0,id1,id2,id3,id4);
  }

  private native void ClipBox_22(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipBox(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipBox_22(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipHexahedron_23(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipHexahedron(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipHexahedron_23(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipBox2D_24(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipBox2D(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipBox2D_24(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipHexahedron2D_25(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipHexahedron2D(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipHexahedron2D_25(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipBox1D_26(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipBox1D(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipBox1D_26(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipHexahedron1D_27(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8);
  public void ClipHexahedron1D(vtkPoints id0,vtkGenericCell id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8)
  {
    ClipHexahedron1D_27(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void ClipBox0D_28(vtkGenericCell id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7);
  public void ClipBox0D(vtkGenericCell id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7)
  {
    ClipBox0D_28(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void ClipHexahedron0D_29(vtkGenericCell id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7);
  public void ClipHexahedron0D(vtkGenericCell id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7)
  {
    ClipHexahedron0D_29(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  public vtkBoxClipDataSet() { super(); }

  public vtkBoxClipDataSet(long id) { super(id); }
  public native long   VTKInit();

}
